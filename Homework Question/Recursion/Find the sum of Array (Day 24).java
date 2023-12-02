import java.io.*;
import java.util.*;

public class Solution {
    public static int sumOfArray(int arr[], int idx) {
        if (idx == arr.length) {
            return 0;
        }
        
        return arr[idx] + sumOfArray(arr,idx+1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println(sumOfArray(arr,0));
    }
}
