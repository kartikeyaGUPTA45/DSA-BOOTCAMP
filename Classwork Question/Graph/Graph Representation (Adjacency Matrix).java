import java.io.*;
import java.util.*;

public class Solution {
    
      public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      int arr[][] = new int [n][n];
        
      for (int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        arr[u][v] = 1;
        arr[v][u] = 1;
      }  
        
        
      for (int i=0;i<n;i++) {
        System.out.print(i + " ");
        for(int j = 0;j<n;j++) {
          if (arr[i][j] == 1) {
            System.out.print(j + " ");
          }
        }
        System.out.println();
    } 
      }
}
