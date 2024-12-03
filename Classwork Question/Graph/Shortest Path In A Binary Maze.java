import java.io.*;
import java.util.*;

public class Solution {
  public static class Pair {
    int distance;
    int row;
    int col;
    
    public Pair (int distance, int row, int col) {
      this.distance = distance;
      this.row = row;
      this.col = col;
    }
  }
  
    public static int path(int arr[][], int srcRow, int srcCol, int destRow, int destCol, int m, int n) {
      int dist[][] = new int[m][n];
      for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
          dist[i][j] = (int)(1e9);
        }
      }
      
      Queue<Pair> q = new LinkedList<>();
      dist[srcRow][srcCol] = 0;
      q.add(new Pair (0,srcRow, srcCol));
      
      int dRow [] = {-1,0,1,0};
      int dCol [] = {0,1,0,-1};
      
      while(q.size() > 0) {
        Pair p =q.remove();
        for(int i=0;i<4;i++) {
          int nRow = dRow[i] + p.row;
          int nCol = dCol[i] + p.col;
          
          if (nRow >= 0 && nRow <m && nCol >= 0 && nCol <n && arr[nRow][nCol] == 1 && dist[nRow][nCol] > 1 + p.distance) {
            dist[nRow][nCol] = 1+p.distance;
            if (nRow == destRow && nCol == destCol) {
              return 1+p.distance;
            }
            q.add(new Pair(dist[nRow][nCol],nRow,nCol));
          }
        }
      }
      return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int m = scn.nextInt();
      int n = scn.nextInt();
      int arr[][] = new int[m][n];
      for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      int srcRow = scn.nextInt();
      int srcCol = scn.nextInt();
      int destRow = scn.nextInt();
      int destCol = scn.nextInt();
      
      System.out.println(path(arr,srcRow,srcCol,destRow,destCol,m,n));
      
    }
}
