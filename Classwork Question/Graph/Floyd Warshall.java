import java.io.*;
import java.util.*;

public class Solution {
    public static int shortestPath(int adj[][], int n, int m, int src, int dest) {
      for(int k = 1;k<=n;k++) {
        for(int i=1;i<=n;i++) {
          for(int j=1;j<=n;j++) {
            adj[i][j] = Math.min(adj[i][j] , adj[i][k] + adj[k][j]);
          }
        }
      }
      
      return adj[src][dest];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      int src = scn.nextInt();
      int dest = scn.nextInt();
      
      int adj [][] = new int [n+1][n+1];
      
      for (int i=0;i<=n;i++) {
        for(int j=0;j<=n;j++) {
          if (i == j) {
            adj[i][j] = 0;
          } else {
            adj[i][j] = (int)(1e9);
          }
        }
      }
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        int wt = scn.nextInt();
        
        adj[u][v] = wt;
      }
      
      System.out.println(shortestPath(adj,n,m,src,dest));
      
    }
}
