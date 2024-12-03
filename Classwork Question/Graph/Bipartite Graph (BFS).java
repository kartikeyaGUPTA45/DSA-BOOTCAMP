import java.io.*;
import java.util.*;

public class Solution {
  public static boolean helper(List<List<Integer>> adj, int color[], int node) {
    Queue<Integer> q = new LinkedList<>();
    q.add(node);
    color[node] = 0;
    
    while (q.size() > 0) {
      node = q.poll();
      for(int nbr : adj.get(node)) {
        if (color[nbr] == -1) {
          color[nbr] = 1-color[node];
          q.add(nbr);
        } else if (color[node] == color[nbr]) {
          return false;
        }
      }
    }
    
    return true;
  }
  
   public static boolean isBipartite(List<List<Integer>> adj, int n) {
     int color[] = new int[n];
     Arrays.fill(color,-1);
     
     for(int i=0;i<n;i++) {
       if (color[i] == -1) {
         if(helper(adj,color,i)== false){
           return false;
         }
       }
     }
     return true;
   }
   public static List<List<Integer>> prepareAdjList(int arr[][], int n) {
     List<List<Integer>> adj = new ArrayList<>();
     
     for(int i=0;i<n;i++) {
       adj.add(new ArrayList<>());
     }
     
     for(int i=0;i<n;i++) {
       for(int j=0;j<n;j++) {
         if (arr[i][j] == 1 && i != j) {
           adj.get(i).add(j);
           adj.get(j).add(i);
         }
       }
     }
     
     return adj;
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[][] =  new int[n][n];
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      List<List<Integer>> adj = prepareAdjList(arr,n);
      System.out.println(isBipartite(adj,n));
    }
}
