import java.io.*;
import java.util.*;

public class Solution {
    public static void floodFill(boolean checkCell[][], int arr[][], int sr, int sc, int dr, int dc, String ans){
        if(sr<0 || sc<0 || sr>dr || sc>dc || arr[sr][sc] == 1 || checkCell[sr][sc] == true){
            return;
        }
        
        if(sr == dr && sc == dc){
            System.out.println(ans);
            return;
        }
        
        checkCell[sr][sc] = true;
        
        floodFill(checkCell, arr,sr-1,sc,dr,dc,ans+"t");
        floodFill(checkCell, arr,sr,sc-1,dr,dc,ans+"l");
        floodFill(checkCell, arr,sr+1,sc,dr,dc,ans+"d");
        floodFill(checkCell, arr,sr,sc+1,dr,dc,ans+"r");
        
        checkCell[sr][sc] = false;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr [][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        boolean checkCell [][] = new boolean [n][m];
        
        floodFill(checkCell,arr, 0, 0, n-1,m-1,"");
    }
}
