import java.io.*;
import java.util.*;

public class Solution {
    
    public static int firstIndex(int arr[],int d){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == d){
                return i;
            }
        }
        return -1;
    }
    
    public static int lastIndex1(int arr[],int d){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] == d){
                return i;
            }
        }
        return -1;
    }
    
    public static int lastIndex2(int arr[],int d){
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == d){
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int d = scn.nextInt();
        
        System.out.println(firstIndex(arr,d));
        System.out.println(lastIndex2(arr,d));
    }
}
