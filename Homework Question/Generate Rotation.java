import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void reverse(char arr[],int left,int right){
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            
            left++;
            right--;
        }
    }
    
    public static void generateRotation(String str,int k){
        int len=str.length();
        char[] arr = str.toCharArray();
        
        reverse(arr,0,len-1);
        reverse(arr,0,k-1);
        reverse(arr,k,len-1);
        
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        for(int i=0;i<str.length();i++){
            generateRotation(str,i);
        }
    }
}
