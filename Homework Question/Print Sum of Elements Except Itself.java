import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    public static void sumOfElementExceptItself(int arr[],int n){
         int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        
        for(int i=0;i<n;i++){
            int num=sum-arr[i];
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        sumOfElementExceptItself(arr,n);
       
    }
}
