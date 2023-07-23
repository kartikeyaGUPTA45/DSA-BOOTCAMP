import java.io.*;
import java.util.*;

public class Solution {
    
    public static void fillRowAndColWithMinusOne(int arr[][],int row,int col){
        for(int j=0;j<arr[0].length;j++){ // For filling row with value -1
            if(arr[row][j] !=1){
                arr[row][j] = -1;
            }
        }
        
        for(int i =0;i<arr.length;i++){ // For filling column with value -1
            if(arr[i][col] !=1){
                arr[i][col] = -1;
            }
        }
        
    }
    
    public static void modifyTheMatrix(int arr[][]){
        int m = arr.length;
        int n =arr[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 1){
                    fillRowAndColWithMinusOne(arr,i,j);
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == -1){
                    arr[i][j]=1;
                }
            }
        }
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int m =scn.nextInt();
        int n = scn.nextInt();
        
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        modifyTheMatrix(arr);
    }
}
