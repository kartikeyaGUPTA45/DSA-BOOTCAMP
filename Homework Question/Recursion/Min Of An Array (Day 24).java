import java.io.*;
import java.util.*;

public class Solution {
    public static int minOfArray(int arr[], int idx) {
        if(idx == arr.length) {
            return Integer.MAX_VALUE;
        }
        
        int ans = minOfArray(arr,idx+1);
        
        if (ans > arr[idx]) {
            return arr[idx];
        } else {
            return ans;
        }
    } 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println(minOfArray(arr,0));
    }
}
