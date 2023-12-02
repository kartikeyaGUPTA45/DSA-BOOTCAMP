import java.io.*;
import java.util.*;

public class Solution {
    public static int lastIndex(int arr[], int idx, int x) {
        if(idx == -1) {
            return -1;
        }
        
        if(arr[idx] == x) {
            return idx;
        } else {
            return lastIndex(arr,idx-1,x);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
    
        System.out.println(lastIndex(arr,n-1,x));
    }
}
