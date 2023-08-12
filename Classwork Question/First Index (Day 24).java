import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int firstIndex(int i,int n,int arr[],int x){
        
        if(i == n) return -1;
        
        if(arr[i] == x) return i;
        else return firstIndex(i+1,n,arr,x);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int x = scn.nextInt();
        
        System.out.println(firstIndex(0,n,arr,x));
    }
}
