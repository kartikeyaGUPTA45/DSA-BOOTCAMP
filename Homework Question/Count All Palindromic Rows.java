import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean checkPalindrome(int arr[][],int row){
        
        int n=arr[0].length;
        
        int left=0;
        int right=n-1;
        
        while(left<right){
            
            if(arr[row][left]!=arr[row][right]){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static int countPalindromicRows(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        
        int count=0;
        for(int i=0;i<m;i++){
            boolean ans=checkPalindrome(arr,i);
            if(ans==true){
                count+=1;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        
        int arr[][]=new int [m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int count=countPalindromicRows(arr);
        System.out.println(count);
    }
}
