import java.io.*;
import java.util.*;

public class Solution {
    public static int findRepeat(int arr[], int n) {
        int ans = 0;
        for (int i=0;i<n;i++) {
            ans ^= i;
            ans ^= arr[i];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println(findRepeat(arr,n));
    }
}
