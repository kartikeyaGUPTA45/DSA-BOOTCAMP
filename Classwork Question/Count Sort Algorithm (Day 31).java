import java.io.*;
import java.util.*;

public class Solution {
    public static void countSort(int arr[],int n,int min, int max){
        int freq[] = new int[max-min+1];
        
        for(int i=0;i<n;i++){
            freq[arr[i]-min]++;
        }
        
        for(int i=1;i<freq.length;i++){
            freq[i] += freq[i-1];
        }
        
        int ans[] = new int[n];
        for(int i=arr.length-1;i>=0;i--){
            int pos = freq[arr[i]-min]-1;
            ans[pos] = arr[i];
            freq[arr[i]-min]--;
        }
        
        for(int i=0;i<n;i++){
            arr[i] = ans[i];
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
            min = Math.min(arr[i],min); 
            max = Math.max(max,arr[i]);
        }
        
        countSort(arr,n, min,max);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
        
    }
}
