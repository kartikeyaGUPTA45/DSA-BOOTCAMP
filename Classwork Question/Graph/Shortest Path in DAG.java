import java.io.*;
import java.util.*;

public class Solution {
    public static class Pair {
        int vtx;
        int wt;
        
        public Pair(int vtx, int wt) {
            this.vtx = vtx;
            this.wt = wt;
        }
    }
    
    public static void shortestPath(List<List<Pair>> adj, int n) {
        Stack<Integer> st = new Stack<>();

        int[] vis = new int[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                dfs(i, adj, vis, st);
            }
        }
        
        int[] dis = new int[n];
        Arrays.fill(dis, (int) 1e9);
        dis[0] = 0;

        while (!st.isEmpty()) {
            int u = st.pop();

            for (Pair i : adj.get(u)) {
                int v = i.vtx;
                int w = i.wt;
                if (dis[v] > dis[u] + w) {
                    // Updating dis[v].
                    dis[v] = dis[u] + w;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (dis[i] == (int) 1e9) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(dis[i] + " ");
            }
        }
    }
    
    public static void dfs(int i, List<List<Pair>> adj, int[] vis, Stack<Integer> st) {
        vis[i] = 1;
        for (Pair j : adj.get(i)) {
            if (vis[j.vtx] == 0) {
                dfs(j.vtx, adj, vis, st);
            }
        }
        st.push(i);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        List<List<Pair>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            int w = scn.nextInt();
            
            adj.get(u).add(new Pair(v,w));
        }
        
        shortestPath(adj,n);
    }
}
