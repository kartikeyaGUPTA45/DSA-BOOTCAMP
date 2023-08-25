import java.io.*;
import java.util.*;

public class Solution {
    public static void targetSum(int arr[],int n, int target){
        Arrays.sort(arr);
        int low = 0, high = n-1;
        while(low<high){
            int sum = arr[low] + arr[high];
            
            if(sum == target){
                System.out.println(arr[low] + " " + arr[high]);
                low++;
                high--;
            }else if(sum > target){
                high--;
            }else{
                low++;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int target = scn.nextInt();
        
        targetSum(arr,n, target);
    }
}
