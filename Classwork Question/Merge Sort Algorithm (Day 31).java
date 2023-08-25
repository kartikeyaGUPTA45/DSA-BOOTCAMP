import java.io.*;
import java.util.*;

public class Solution {
    public static int [] mergeTwoSortedArray(int a[],int b[]){
        int n1 = a.length;
        int n2 = b.length;
        
        int res[] = new int[n1+n2];
        
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a[i] > b[j]){
                res[k] = b[j];
                k++;
                j++;
            }else{
                res[k] = a[i];
                i++;
                k++;
            }
        }
        
        while(i<n1){
            res[k] = a[i];
            i++;
            k++;
        }
        
        while(j<n2){
            res[k] = b[j];
            j++;
            k++;
        }
        
        return res;
    }
    
    public static int [] mergeSort(int arr[],int low, int high){
        if(low == high){
            int base[] = new int[1];
            base[0] = arr[low];
            return base;
        }
        
        int mid = (low+high)/2;
        
        int a[] = mergeSort(arr,low,mid);
        int b[] = mergeSort(arr,mid+1,high);
        
        return mergeTwoSortedArray(a,b);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        arr = mergeSort(arr, 0, n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
