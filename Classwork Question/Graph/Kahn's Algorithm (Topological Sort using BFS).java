import java.io.*;
import java.util.*;

public class Solution {
   public static void topologicalSort(List<List<Integer>> adj, int V) {
     int indegree[] = new int [V];
     for(int i=0;i<V;i++) {
       for(int nbr:adj.get(i)) {
         indegree[nbr]++;
       }
     }
     
     Queue<Integer> q = new LinkedList<>();
     
     for(int i=0;i<V;i++) {
       if(indegree[i] == 0) {
         q.add(i);
       }
     }
     
     while(q.size()> 0) {
       int node =q.poll();
       System.out.print(node + " ");
       for(int nbr:adj.get(node)) {
         indegree[nbr]--;
         if(indegree[nbr] == 0) {
           q.add(nbr);
         }
       }
     }
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int V = scn.nextInt();
      int E = scn.nextInt();
      
      List<List<Integer>> adj = new ArrayList<>();
      for(int i=0;i<V;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<E;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        adj.get(u).add(v);
      }
      
      topologicalSort(adj,V);
    }
}
