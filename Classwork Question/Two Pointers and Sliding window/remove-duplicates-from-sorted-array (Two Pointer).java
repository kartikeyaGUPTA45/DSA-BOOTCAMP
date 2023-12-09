import java.io.*;
import java.util.*;

public class Solution {
    public static int removeDuplicates(int arr[], int n) {
        int index = 1;
        
        for(int i=1;i<n;i++) {
            if (arr[i] != arr[i-1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        
        return index;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println(removeDuplicates(arr,n));
    }
}
