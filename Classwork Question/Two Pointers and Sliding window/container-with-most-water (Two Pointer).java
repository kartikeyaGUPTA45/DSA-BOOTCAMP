import java.io.*;
import java.util.*;

public class Solution {
    public static int maxWater(int arr[], int n) {
        int left = 0, right = n-1, maxArea = 0;
        
        while(left<right) {
            int leftHt = arr[left];
            int rightHt = arr[right];
            
            int currArea = Math.min(leftHt,rightHt)*(right-left);
            maxArea = Math.max(maxArea,currArea);
            
            if(leftHt <= rightHt) {
                left++;
            } else {
                right--;
            }  
        }
        
        return maxArea;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println(maxWater(arr,n));
    }
}
