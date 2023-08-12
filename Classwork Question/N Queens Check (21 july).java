import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean check(int arr[][],int row,int col){
        int n=arr.length;
        
        for(int j=col+1;j<n;j++){
            if(arr[row][j]==1){
                return true;
            }
        }
        
        for(int j=col-1;j>=0;j--){
            if(arr[row][j]==1){
                return true;
            }
        }
        
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]==1){
                return true;
            }
        }
        
        for(int i=row+1;i<n;i++){
            if(arr[i][col]==1){
                return true;
            }
        }
        
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(arr[i][j]==1){
                return true;
            }
        }
        
        for(int i=row+1,j=col-1;i<n && j>=0;j--,i++){
            if(arr[i][j]==1){
                return true;
            }
        }
        
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]==1){
                return true;
            }
        }
        
        for(int i=row+1,j=col+1;i<n && j<n ; i++,j++){
            if(arr[i][j]==1){
                return true;
            }
        }
        
        
        return false;
        
        
        
    }
    
    public static String nQueens(int arr[][]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    boolean ans=check(arr,i,j);
                    if(ans==true){
                        return "Danger";
                    }
                }
            }
        }
        
        return "N Queens";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        String ans=nQueens(arr);
        System.out.println(ans);
    }
}
