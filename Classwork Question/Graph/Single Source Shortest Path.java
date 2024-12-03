import java.io.*;
import java.util.*;

public class Solution {
    public static void shortestPath(List<List<Integer>> adj, int n, int src) {
        int dis[] = new int[n];
        Arrays.fill(dis,(int)1e9);
        
        Queue<Integer> q = new LinkedList<>();
        
        dis[src] = 0;
        q.add(src);
        
        while(q.size() > 0) {
            int node  = q.poll();
            for(int nbr:adj.get(node)) {
                if(dis[nbr] > dis[node] + 1) {
                    dis[nbr] = dis[node]+1;
                    q.add(nbr);
                }
            }
        }
        
        for(int i=0;i<n;i++) {
            System.out.print(dis[i] + " ");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        int src = scn.nextInt();
        
        shortestPath(adj,n,src);
    }
}
