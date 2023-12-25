import java.io.*;
import java.util.*;

public class Solution {
  
  public static class Pair {
     int node;
     int parent;
     
     public Pair(int node, int parent) {
       this.parent = parent;
       this.node = node;
     }
}
  
  public static boolean helper(List<List<Integer>> adj , int node, int vis[]) {
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(node,-1));
    vis[node]=1;
    
    while(q.size() > 0) {
      Pair p = q.poll();
      
      for (int nbr:adj.get(p.node)) {
        if (vis[nbr] == 0) {
          vis[nbr] = 1;
          q.add(new Pair(nbr,p.node));
        } else if (p.parent != nbr) {
          return true;
        }
      }
    }
    return false;
  }
  
  
  public static boolean isCycle(List<List<Integer>> adj, int n) {
    int vis[] = new int[n];
    
    for(int i=0;i<n;i++) {
      if (vis[i] == 0){
      if (helper(adj,i,vis)) {
        return true;
      }
    }}
    
    return false;
  }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      List<List<Integer>> adj = new ArrayList<>();
      
      for (int i =0;i<n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        adj.get(u).add(v);
        adj.get(v).add(u);
      }
      
      System.out.println(isCycle(adj,n));
      
    }
} 
