import java.io.*;
import java.util.*;

public class Solution {
   public static void dfs_helper(List<List<Integer>> adj, int node, int vis[]) {
     vis[node] = 1;
     for(int nbr: adj.get(node)) {
       if (vis[nbr] == 0) {
         dfs_helper(adj,nbr,vis);
       }
     }
   }
  
   public static int dfs(int arr[][], int n) {
     List<List<Integer>> adj = new ArrayList<>();
     for(int i=0;i<n;i++) {
       adj.add(new ArrayList<>());
     }
     
     for(int i=0;i<n;i++) {
       for(int j=0;j<n;j++) {
         if(arr[i][j] == 1 && i!= j) {
           adj.get(i).add(j);
           adj.get(j).add(i);
         }
       }
     }
     
     int vis[] = new int[n];
     
     int count =0;
     for(int i=0;i<n;i++) {
       if (vis[i] == 0) {
         count++;
         dfs_helper(adj,i,vis);
       }
     }
     return count;
     
   }
  

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[][] = new int[n][n];
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      System.out.println(dfs(arr,n));
    }
}
