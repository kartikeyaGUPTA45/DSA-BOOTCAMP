import java.io.*;
import java.util.*;

public class Solution {
   public static boolean helper(int node, int vis[], int pathVis[], List<List<Integer>> adj) {
     vis[node] = 1;
     pathVis[node] = 1;
     
     for(int nbr:adj.get(node)) {
       if (vis[nbr] == 0) {
         if(helper(nbr,vis,pathVis,adj) == true) {
           return true;
         } 
       } else if (pathVis[nbr] == 1) {
         return true;
       }
     }
     pathVis[node] = 0;
     
     return false;
   }
  
    public static boolean isCycle(List<List<Integer>> adj, int v) {
      int vis[] = new int[v];
      int pathVis[] = new int[v];
      
      for(int i=0;i<v;i++) {
        if(vis[i] == 0) {
          if (helper(i,vis,pathVis,adj) == true) {
            return true;
          }
        }
      }
      
      return false;
    }
  

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int v = scn.nextInt();
      int e = scn.nextInt();
      
      List<List<Integer>> adj = new ArrayList<>();
      for (int i=0;i<v;i++) {
        adj.add(new ArrayList<>());
      }
      
      for (int i=0;i<e;i++) {
        int u = scn.nextInt();
        int w = scn.nextInt();
        
        adj.get(u).add(w);
      }
      
      System.out.println(isCycle(adj,v));
    }
}
