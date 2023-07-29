import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean checkPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        
        
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static String returnFirstPalindrome(String arr[]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            boolean ans=checkPalindrome(arr[i]);
            if(ans==true){
                return arr[i];
            }
        }
        
        return "empty";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        String arr[]=new String[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.next();
        }
        
        String ans=returnFirstPalindrome(arr);
        System.out.println(ans);
    }
}
