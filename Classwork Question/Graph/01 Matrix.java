import java.io.*;
import java.util.*;

public class Solution {
    public static class Pair {
      int row;
      int col;
      int dist;
      
      public Pair(int row, int col,int dist) {
        this.row = row;
        this.col = col;
        this.dist = dist;
      }
    }
    public static int [][] nearestOne(int arr[][], int n, int m) {
      Queue<Pair> q = new LinkedList<>();
      int vis[][] = new int[n][m];
      int distance[][] = new int[n][m];
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
          if (arr[i][j] == 1) {
            vis[i][j] = 1;
            q.add(new Pair(i,j,0));
          }
        }
      }
      
      int drow[] = {-1,0,1,0};
      int dcol[] = {0,-1,0,1};
      
      while(q.size() > 0) {
        Pair p = q.poll();
        
        distance[p.row][p.col] = p.dist;
        for (int i=0;i<4;i++) {
          int nrow = p.row + drow[i];
          int ncol = p.col + dcol[i];
          
          if (nrow >= 0 && nrow <n && ncol >= 0 && ncol <m && vis[nrow][ncol]== 0) {
            q.add(new Pair(nrow,ncol,p.dist+1));
            vis[nrow][ncol] = 1;
          }
        }
        
      }
      
      return distance;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      int arr[][] = new int[n][m];
      for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      arr = nearestOne(arr,n,m);
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }
}
