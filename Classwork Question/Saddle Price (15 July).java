import java.io.*;
import java.util.*;

public class Solution {
    public static void saddlePrice(int arr[][],int n){
        for(int i=0;i<n;i++){
            int min = arr[i][0];
            int col = 0;
            boolean flag = true;
            for(int j=1;j<n;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                    col = j;
                }
            }
            
            for(int k =0;k<n;k++){
                if(min <arr[k][col]){
                    flag = false;
                    break;
                }
            }
            
            if(flag == true){
                System.out.println(min);
                return ;
            } 
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        saddlePrice(arr,n);
    }
}
