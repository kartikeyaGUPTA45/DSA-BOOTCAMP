import java.io.*;
import java.util.*;

public class Solution {
    public static double maxAvg(int arr[], int n, int k) {
        int sum =0, i = 0,j=k,maxSum = 0;
        
        for(int a = 0;a<k;a++) {
            sum += arr[a];
        }
        
        maxSum =sum;
        
        while(j<n) {
            sum += arr[j];
            sum -= arr[i];
            j++;
            i++;
            maxSum = Math.max(sum,maxSum);
        }
        
        return (double)maxSum/(double)k;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        
        double ans = maxAvg(arr,n,k); 
        System.out.format("%,.5f",ans);
    }
}
