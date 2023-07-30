import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void spiralDisplay(int arr[][],int n,int m){
        int rmin = 0;
        int cmin = 0;
        int rmax= n-1;
        int cmax = m-1;
        
        int count = 0;
        
        while(count < m*n){
            // downward dirn
            for(int row = rmin;row<=rmax && count<m*n;row++){
                System.out.println(arr[row][cmin]);
                count++;
            }
            
            cmin++;
            
            // horizontal dirn (l to r)
            for(int col = cmin;col<=cmax && count<m*n;col++){
                System.out.println(arr[rmax][col]);
                count++;
            }
            
            rmax--;
            
            // upward dirn 
            for(int row =rmax;row>=rmin && count<m*n;row--){
                System.out.println(arr[row][cmax]);
                count++;
            }
            
            cmax--;
            
            for(int col = cmax;col>=cmin && count<m*n;col--){
                System.out.println(arr[rmin][col]);
                count++;
            }
            
            rmin++;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int arr[][] = new int[n][m];
        for(int i =0 ;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        spiralDisplay(arr,n,m);
    }
}
