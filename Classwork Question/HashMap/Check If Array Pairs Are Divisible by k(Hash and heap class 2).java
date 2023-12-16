import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkDivisible(int arr[], int n, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++) {
            int rem = arr[i]%k;
            int value = map.getOrDefault(rem,0);
            map.put(rem,value+1);
        }
        
        for(int i=0;i<n;i++) {
            int rem = arr[i]%k;
            if(rem == 0) {
                if(map.get(rem)%2 != 0) {
                    return false;
                }
            } else if (2* rem == k) {
                if(map.get(rem)%2 != 0) {
                    return false;
                }
            } else {
                int freqOfRem = map.get(rem);
                int freqOfKRem = map.getOrDefault(k-rem,0);
                
                if (freqOfRem != freqOfKRem) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println(checkDivisible(arr,n,k));
    }
}
