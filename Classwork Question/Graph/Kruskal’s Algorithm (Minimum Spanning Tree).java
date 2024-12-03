import java.io.*;
import java.util.*;

public class Solution {
    public static class DisjointSetUnion {
      List<Integer> rank = new ArrayList<>();
      List<Integer> parent = new ArrayList<>();
      
      public DisjointSetUnion(int n) {
        for(int i=0;i<=n;i++) {
          rank.add(0);
          parent.add(i);
        }
      }
      
      public int findParent(int node) {
        if(node == parent.get(node)) {
          return node;
        }
        
        int p = findParent(parent.get(node));
        parent.set(node,p);
        return parent.get(node);
      }
      
      public void unionByRank(int u, int v) {
        int parentU = findParent(u);
        int parentV = findParent(v);
        
        if (parentU == parentV) {
          return;
        }
        
        if (rank.get(parentU) < rank.get(parentV)) {
          parent.set(parentU,parentV);
        } else if (rank.get(parentV) < rank.get(parentU)) {
          parent.set(parentV,parentU);
        } else {
          parent.set(parentV,parentU);
          int rk =rank.get(parentU);
          rank.set(parentU,rk+1);
        }
      }
    }
  
    public static class Pair {
      int vtx;
      int wt;
      
      public Pair(int vtx, int wt) {
        this.vtx = vtx;
        this.wt = wt;
      }
    }
  
    public static class Edges implements Comparable<Edges> {
      int src;
      int dest;
      int wt;
      
      public Edges(int src,int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
      }
      
      public int compareTo(Edges e) {
        return this.wt - e.wt;
      }
    }
  
    public static int mst(List<List<Pair>> adj,int n, int m) {
      List<Edges> edges = new ArrayList<>();
      
      for(int i=0;i<n;i++) {
        for(Pair nbr:adj.get(i)) {
          Edges e = new Edges(i,nbr.vtx,nbr.wt);
          edges.add(e);
        }
      }
      
      DisjointSetUnion dsu = new DisjointSetUnion(n);
      Collections.sort(edges);
      
      int sum = 0;
      for(int i=0;i<edges.size();i++) {
        int wt = edges.get(i).wt;
        int u = edges.get(i).src;
        int v = edges.get(i).dest;
        
        if (dsu.findParent(u) != dsu.findParent(v)) {
          sum +=  wt;
          dsu.unionByRank(u,v);
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
      
      for(int i=0;i<=n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v =scn.nextInt();
        int wt = scn.nextInt();
        
        adj.get(u).add(new Pair(v,wt));
        adj.get(v).add(new Pair(u,wt));
      }
      
      System.out.println(mst(adj,n,m));
    
    }
}
