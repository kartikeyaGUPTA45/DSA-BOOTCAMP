import java.io.*;
import java.util.*;

public class Solution {
    public static void displayReverse1(int arr[], int idx) {
        if (idx<0) {
            return;
        }
        
        System.out.println(arr[idx]);
        displayReverse1(arr,idx-1);
    }
    
    public static void displayReverse2(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        
        displayReverse2(arr,idx+1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        displayReverse2(arr,0);
    }
}
