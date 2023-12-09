import java.io.*;
import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum(int arr[], int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if (n == 0 || n == 1 || n ==2) {
            return ans;
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++) {
            int left = i+1;
            int right = n-1;
            
            while(left<right) {
               int sum = arr[i] + arr[left] + arr[right];
               if (sum == 0) {
                   List<Integer> subAns = new ArrayList<>();
                   subAns.add(arr[i]);
                   subAns.add(arr[left]);
                   subAns.add(arr[right]);
                   if (!ans.contains(subAns)) {
                        ans.add(subAns);
                   }
                   
                   left++;
                   right--;
                   
                   
               } else if (sum > 0) {
                   right--;
               } else {
                   left++;
               }
            }
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
        
        System.out.println(threeSum(arr,n));
    }
}
