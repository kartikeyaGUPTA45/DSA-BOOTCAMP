import java.io.*;
import java.util.*;

public class Solution {
   public static class Pair{
     int row;
     int col;
     int time;
     
     public Pair(int row, int col, int time) {
       this.row = row;
       this.col = col;
       this.time = time;
     }
   }
  
  public static int rottenOranges(int arr[][], int m, int n) {
    Queue<Pair> q = new LinkedList<>();
    int cnt = 0;
    
    for(int i=0;i<m;i++) {
      for(int j=0;j<n;j++) {
        if (arr[i][j] == 1) cnt++;
        else if (arr[i][j] == 2) q.add(new Pair(i,j,0));
      }
    }
    
    int ans = 0;
    
    int drow[] = {-1,0,1,0};
    int dcol[] = {0,-1,0,1};
    
    while(q.size() > 0) {
        Pair p = q.poll();
        for (int i=0;i<4;i++) {
          int nrow = p.row + drow[i];
          int ncol = p.col + dcol[i];
          ans = Math.max(ans,p.time);
          
          if (nrow >= 0 && nrow<m && ncol >= 0 && ncol <n && arr[nrow][ncol] == 1) {
            arr[nrow][ncol] = 2;
            q.add(new Pair(nrow,ncol,p.time+1));
            cnt--;
          }
          
        }
    }
    
    if (cnt != 0) return -1;
    return ans;
   
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
      
      System.out.println(rottenOranges(arr,m,n));
    }
}
