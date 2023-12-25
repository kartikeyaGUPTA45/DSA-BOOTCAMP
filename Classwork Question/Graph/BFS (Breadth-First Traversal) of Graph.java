import java.io.*;
import java.util.*;

public class Solution {
   public static void bfs(int n, List<List<Integer>> adj) {
     int vis[] = new int[n];
     Queue<Integer> q= new LinkedList<>();
     List<Integer> res = new ArrayList<>();
     
     q.add(0);
     vis[0] = 1;
     
     while(q.size() > 0) {
       int node = q.poll();
       res.add(node);
       
       for(int nbr:adj.get(node)) {
         if (vis[nbr] == 0) {
           vis[nbr] = 1;
           q.add(nbr);
         }
       }  
     }
     
     for (int i=0;i<res.size();i++) {
       System.out.print(res.get(i) + " ");
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
      
      bfs(n,adj);
    }
}
