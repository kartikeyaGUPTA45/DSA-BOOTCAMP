import java.io.*;
import java.util.*;

public class Solution {
    public static class Pair {
      int nbr;
      int wt;
      
      public Pair(int nbr, int wt) {
        this.nbr = nbr;
        this.wt = wt;
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      List<Pair> adj[] = new ArrayList[n];
      
      for(int i=0;i<n;i++) {
        adj[i] = new ArrayList<>();
      }
        
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        int wt  = scn.nextInt();
        
        adj[u].add(new Pair(v,wt)); // go to u and add v
        adj[v].add(new Pair(u,wt)); // go to v and add u
      }
      
      for(int i=0;i<n;i++) {
        System.out.print(i + " -> {"); // printing node
        // for(int j=0;j<n;j++) { // wrong step/
        for(int j=0;j<adj[i].size();j++) {
          System.out.print("(" + adj[i].get(j).nbr + "," + adj[i].get(j).wt + ")" ); // printing adjacent nodes
        }
        System.out.println("}");
      }
       
      
    }
}
