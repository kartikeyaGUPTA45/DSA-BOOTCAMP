import java.io.*;
import java.util.*;

public class Solution {
    public static void tss(int arr[], int tar, String asf, int sof, int ind){
        if(sof> tar){
            return;
        }
        
        if(ind == arr.length){
            if(sof == tar){
                System.out.println(asf + ".");
            }
            return;
        }
        
//         Include the current element
        tss(arr,tar, asf+ arr[ind]+", ", sof+arr[ind], ind+1);
//         Exclude the current element
        tss(arr,tar,asf,sof,ind+1);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int tar = scn.nextInt();
        
        tss(arr,tar,"",0,0);
    }
}
