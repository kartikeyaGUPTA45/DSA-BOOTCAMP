import java.io.*;
import java.util.*;

public class Solution {
    public static int maxLength(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        int i = -1;
        map.put(sum,i);
        
        while(i<arr.length-1) {
            i++;
            sum += arr[i];
            
            if(map.containsKey(sum)) {
                int len = i-map.get(sum);
                if (len > maxLen) maxLen = len;
            } else {
                map.put(sum,i);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println(maxLength(arr,n));
    }
}
