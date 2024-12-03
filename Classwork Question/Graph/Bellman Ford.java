import java.io.*;
import java.util.*;

public class Solution {
    public static int [] shortestPath(List<List<Integer>> adj, int n, int m, int src) {
      int dist[] = new int[n+1];
      for(int i=0;i<=n;i++) {
        dist[i] = (int)(1e8);
      }
      
      dist[src] = 0;
      
      for(int i=0;i<n-1;i++) {
        for(List<Integer> edge : adj) {
          int u = edge.get(0);
          int v = edge.get(1);
          int wt = edge.get(2);
          
          if (dist[u] + wt < dist[v]) {
            dist[v] = dist[u] + wt;
          }
        }
      }
      
      return dist;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      int src = scn.nextInt();
      
      List<List<Integer>> adj = new ArrayList<>();
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        int wt = scn.nextInt();
        List<Integer> edge = new ArrayList<>();
        edge.add(u);
        edge.add(v);
        edge.add(wt);
        adj.add(edge);
      }
      
      int dist[] = shortestPath(adj,n,m,src);
      for(int i=1;i<=n;i++) {
        System.out.print(dist[i] + " ");
      }
    }
}
