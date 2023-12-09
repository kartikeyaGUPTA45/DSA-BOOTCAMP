import java.io.*;
import java.util.*;

public class Solution {
    public static int atmost(int arr[], int goal) {
        if (goal<0) {
            return 0;
        }
        
        int i =0,j=0,sum = 0,ans = 0;
        
        while(j<arr.length) {
            sum += arr[j];
            
            while(sum > goal) {
                sum -= arr[i];
                i++;
            }
            
            ans +=(j-i+1);
            j++;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int goal = scn.nextInt();
        
        int count1 = atmost(arr,goal);
        int count2 = atmost(arr,goal-1);
        
        System.out.println(count1-count2);
    }
}
