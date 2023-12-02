import java.io.*;
import java.util.*;

public class Solution {
    public static int fib(int n, int dp[]) {
        if(n == 0 || n == 1) {
            dp[n] = n;
        } 
        
        if (dp[n] != -1) {
            return dp[n];
        }
        
        dp[n] = fib(n-1,dp) + fib(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n+1];
        for(int i=0;i<=n;i++) {
            dp[i] = -1;
        }
        fib(n,dp);
        
        for(int i=0;i<=n;i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
