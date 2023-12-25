import java.io.*;
import java.util.*;

public class Solution {
   public static void dfs_helper(List<List<Integer>> adj, int vis[], int node, List<Integer> ans) {
     vis[node] = 1;
     ans.add(node);
     
     for(int nbr:adj.get(node)) {
       if (vis[nbr] == 0) {
         dfs_helper(adj,vis,nbr,ans);
       }
     }
   }
  
   public static void dfs(List<List<Integer>> adj, int n){
     int vis[] = new int[n];
     List<Integer> ans = new ArrayList<>();
     
     for(int i=0;i<n;i++) {
       if(vis[i] == 0) {
         dfs_helper(adj,vis,i,ans);
       }
     }
     
     for(int i=0;i<n;i++) {
       System.out.print(ans.get(i) + " ");
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
      
      dfs(adj,n);
    }
}
