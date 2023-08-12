import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int powerLog(int x,int n){
        if(n == 0) return 1;
        
        int subAns = powerLog(x,n/2);
        int ans = subAns*subAns;
        if(n%2 != 0) ans*=x;
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        System.out.println(powerLog(x,n));
    }
}
