import java.io.*;
import java.util.*;

public class Solution {
    public static void sortKSorted(int arr[], int k, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<=k;i++) {
            pq.add(arr[i]);
        }
        
        for(int i=k+1;i<n;i++) {
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }
        
        while(pq.size() >0 ){
            System.out.println(pq.remove());
        }
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
        sortKSorted(arr,k,n);
    }
}
