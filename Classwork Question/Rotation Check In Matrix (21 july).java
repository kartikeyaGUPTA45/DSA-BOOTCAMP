import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String checkMatrix(int arr[][]){
        int n=arr.length;
        
        String str="";
        for(int j=0;j<n;j++){
            str+=arr[0][j];
        }
        
        str=str+str;
        
        
        for(int i=1;i<n;i++){
            String curr="";
            for(int j=0;j<n;j++){
                curr+=arr[i][j];
            }
            if(str.indexOf(curr)==-1){
                return "NO";
            }
        }
        
        return "YES";
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
        
        String ans=checkMatrix(arr);
        
        System.out.println(ans);
    }
}
