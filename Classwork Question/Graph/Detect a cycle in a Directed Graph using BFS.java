import java.io.*;
import java.util.*;

public class Solution {
   public static boolean topologicalSort(List<List<Integer>> adj, int N) {
     int indegree[] = new int[N];
     for(int i=0;i<N;i++) {
       for(int nbr:adj.get(i)) {
         indegree[nbr]++;
       }
     }
     
     Queue<Integer> q = new LinkedList<>();
     int cnt = 0;
     
     for(int i=0;i<N;i++) {
       if(indegree[i] == 0) q.add(i);
     }
     
     while(q.size() > 0) {
       int node = q.poll();
       cnt++;
       
       for(int nbr:adj.get(node)) {
         indegree[nbr]--;
         if (indegree[nbr] == 0) {
           q.add(nbr);
         }
       }
     }
     
     if (cnt == N)  return false;
     return true;
   }
  

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int N = scn.nextInt();
      int M = scn.nextInt();
      
      List<List<Integer>> adj = new ArrayList<>();
      
      for(int i=0;i<N;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<M;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        adj.get(u).add(v);
      }
      
      System.out.println(topologicalSort(adj,N));
    }
}
