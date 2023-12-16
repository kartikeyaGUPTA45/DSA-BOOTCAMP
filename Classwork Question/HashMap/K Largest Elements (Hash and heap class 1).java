import java.io.*;
import java.util.*;

public class Solution {
    public static void kLargestElements(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<n;i++) {
            if(i<k) pq.add(arr[i]);
            else {
                if(arr[i] > pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        
        while(pq.size() > 0) {
            System.out.println(pq.remove());
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = scn.nextInt();
        int k = scn.nextInt();
        
        kLargestElements(arr,n,k);
    }
}
