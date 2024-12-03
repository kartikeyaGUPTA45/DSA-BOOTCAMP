import java.io.*;
import java.util.*;

public class Solution {
    public static class Pair {
      int vtx;
      int wt;
      
      public Pair(int vtx, int wt) {
        this.vtx = vtx;
        this.wt = wt;
      }
    }
  
  public static class PQPair {
    int node;
    int distance;
    
    public PQPair(int distance, int node) {
      this.distance = distance;
      this.node = node;
    }
  }
  
  public static int mst(List<List<Pair>> adj, int n, int m) {
    int vis[] = new int [n];
    PriorityQueue<PQPair> pq = new PriorityQueue<>((a,b) -> a.distance - b.distance);
    pq.add(new PQPair(0,0));
    int sum = 0;
    
    while(pq.size() > 0) {
      PQPair p = pq.remove();
      
      if(vis[p.node] == 1) continue;
      
      vis[p.node] =1;
      sum += p.distance;
      
      for(Pair nbr:adj.get(p.node)) {
        int adjNode = nbr.vtx;
        int wt = nbr.wt;
        
        if(vis[adjNode] == 0) {
          pq.add(new PQPair(wt,adjNode));
        }
      }
    }
    
    return sum;
  }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      List<List<Pair>> adj = new ArrayList<>();
      for(int i=0;i<n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        int wt = scn.nextInt();
        
        adj.get(u).add(new Pair(v,wt));
        adj.get(v).add(new Pair(u,wt));
      }
      
      System.out.println(mst(adj,n,m));
    }
}
