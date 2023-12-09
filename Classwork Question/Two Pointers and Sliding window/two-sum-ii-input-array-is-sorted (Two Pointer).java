import java.io.*;
import java.util.*;

public class Solution {
    
    public static void twoSum(int arr[], int n, int target) {
        int left = 0;
        int right = n-1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target ) {
                System.out.println(left+1 + " " + (right+1));
                return;
            } else if (sum <target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=  new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int target = scn.nextInt();
        
        twoSum(arr,n,target);
    }
}
