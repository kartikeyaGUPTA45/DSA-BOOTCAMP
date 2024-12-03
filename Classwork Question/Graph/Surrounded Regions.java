import java.io.*;
import java.util.*;

public class Solution {
   public static void dfs(int row, int col, int vis[][], char arr[][], int drow[], int dcol[], int m, int n) {
     vis[row][col] = 1;
     for(int i=0;i<4;i++) {
       int nrow = row + drow[i];
       int ncol = col + dcol[i];
       
       if (nrow >= 0 && nrow<m && ncol >= 0 && ncol <n && arr[nrow][ncol] == 'O' && vis[nrow][ncol] == 0) {
         dfs(nrow,ncol,vis,arr,drow,dcol,m,n);
       }
     }
   }
   public static void surroundedRegions(char arr[][], int m,int n) {
     int vis[][] = new int[m][n];
     int drow[] = {-1,0,1,0};
     int dcol[] = {0,-1,0,1};
     
     for(int i = 0;i<n;i++) {
       if (vis[0][i] == 0 && arr[0][i] == 'O') {
         dfs(0,i,vis,arr,drow,dcol,m,n);
       }
       
       if (vis[m-1][i] == 0 && arr[m-1][i] == 'O') {
         dfs(m-1,i,vis,arr,drow,dcol,m,n);
       }
     }
     
     for(int i = 0;i<m;i++) {
       if (vis[i][0] == 0 && arr[i][0] == 'O') {
         dfs(i,0,vis,arr,drow,dcol,m,n);
       }
       
       if (vis[i][n-1] == 0 && arr[i][n-1] == 'O') {
         dfs(i,n-1,vis,arr,drow,dcol,m,n);
       }
     }
     
     for(int i=0;i<m;i++) {
       for(int j=0;j<n;j++) {
         if(vis[i][j] == 0 && arr[i][j] == 'O') {
           arr[i][j] = 'X';
         }
       }
     }
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int m = scn.nextInt();
      int n = scn.nextInt();
      char arr[][] = new char[m][n];
      
      for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.next().charAt(0);
        }
      }
      
      surroundedRegions(arr,m,n);
      
      for(int i = 0;i<m;i++) {
        for(int j=0;j<n;j++) {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }
}
