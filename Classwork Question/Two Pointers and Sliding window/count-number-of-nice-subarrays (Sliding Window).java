import java.io.*;
import java.util.*;

public class Solution {
    public static int atmost(int arr[], int k) {
        int left = 0, right = 0, ans = 0,count =0;
        
        while (right<arr.length) {
            count += arr[right]%2;
            while(count>k) {
                count-=arr[left]%2;
                left++;
            }
            
            ans += (right-left+1);
            right++;
        }
        return ans;
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
        
        int count1 = atmost(arr,k);
        int count2 = atmost(arr,k-1);
        
        System.out.println(count1-count2);
    }
}
