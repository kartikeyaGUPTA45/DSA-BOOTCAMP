import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int [] findAllIndices(int ind,int n, int arr[], int x, int count){
        if(ind == n){
            int base[] = new int[count];
            return base;
        }
        
        int ans [] ;
        if(arr[ind] == x){
            ans = findAllIndices(ind+1,n,arr,x,count+1);
            ans[count] = ind;
        }else{
            ans  = findAllIndices(ind+1,n,arr,x,count);
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        
        int ans [] =  findAllIndices(0,n,arr,x,0);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        
    }
}
