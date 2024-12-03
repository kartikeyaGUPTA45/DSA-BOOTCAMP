import java.io.*;
import java.util.*;

public class Solution {
  
    public static int minCities(int adj[][], int n, int m, int threshold) {
      for(int k=0;k<n;k++) {
        for(int i =0;i<n;i++) {
          for(int j=0;j<n;j++) {
            adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
          }
        }
      }
      
      int minCity = Integer.MAX_VALUE;
      int city = -1;
      
      for(int i=0;i<n;i++) {
        int tempCity = 0;
        for(int j=0;j<n;j++) {
          if(adj[i][j] <= threshold) {
            tempCity++;
          }
        }
        if (tempCity < minCity || tempCity == minCity && i>city) {
          city = i;
          minCity = tempCity;
        }
      }
      return city;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      int threshold = scn.nextInt();
      
      int adj [][] = new int[n][n];
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          if(i == j) {
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
        adj[v][u] = wt;
      }
      
      System.out.println(minCities(adj,n,m, threshold));
    }
}
