import java.io.*;
import java.util.*;

public class Solution {
     public static int spanOfArray(int arr[]){
        int min = arr[0];
         int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] <min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        return max-min;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        System.out.println(spanOfArray(arr));
    }
}
