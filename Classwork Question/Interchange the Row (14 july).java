import java.io.*;
import java.util.*;

public class Solution {
    public static void interchangeRows(int arr[][],int m,int n){
        for(int k=0;k<n;k++){
            int temp = arr[0][k];
            arr[0][k] = arr[m-1][k];
            arr[m-1][k] = temp;
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        interchangeRows(arr,m,n);
    }
}
