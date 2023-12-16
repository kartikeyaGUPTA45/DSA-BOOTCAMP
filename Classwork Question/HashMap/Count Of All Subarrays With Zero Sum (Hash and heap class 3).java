import java.io.*;
import java.util.*;

public class Solution {
    public static int countOfSubArrays(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0, sum = 0;
        map.put(0,1);
        int i=0;
        while(i<arr.length){
            sum += arr[i];
            if(map.containsKey(sum)) {
                ans += map.get(sum);
                map.put(sum,map.get(sum)+1);
            } else {
                map.put(sum,1);
            }
            i++;
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
        
        System.out.println(countOfSubArrays(arr,n));
    }
}
