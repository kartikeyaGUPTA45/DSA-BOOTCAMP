import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] =scn.nextInt();
        }
        
        int ans=0;
        int j=-1;
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            
            while(count>1){
                j++;
                if(arr[j]==0){
                    count--;
                }
            }
            int len=i-j;
            if(len>ans){
                ans=len;
            }
        }
        
        System.out.println(ans);
    }
}
