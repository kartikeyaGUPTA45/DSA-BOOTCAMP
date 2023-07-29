import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int secondLargest(int arr[]){
        int n=arr.length;
        if(n<=1){
            return -2147483648;
        }
        
        int first_max=-2147483648;
        int second_max=-2147483648;
        
        
        for(int i=0;i<n;i++){ 
            if(first_max==arr[i]){
                continue;
            }
            else if(arr[i]>first_max){
                second_max=first_max;
                first_max=arr[i];
            }
            else if(arr[i]>second_max){
                second_max=arr[i];
            }
        }
        return second_max;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int ans=secondLargest(arr);
        System.out.println(ans);
    }
}
