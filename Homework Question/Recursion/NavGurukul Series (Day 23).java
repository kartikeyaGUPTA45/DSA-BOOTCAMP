import java.io.*;
import java.util.*;

public class Solution {
    public static int navGurukulSeries(int n, int dp[]) {
        if (n == 1) {
            return dp[n] = 0;
        }
        
        if (n == 2) {
            return dp[n] = 1;
        }
        
        int ans1 = navGurukulSeries(n-1,dp);
        int ans2 = navGurukulSeries(n-2,dp);
        return dp[n] = (ans2*ans2) - ans1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int [n+1];
        
        Arrays.fill(dp,-1);
        
        navGurukulSeries(n,dp);
        
        
        for(int i=1;i<=n;i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
