import java.io.*;
import java.util.*;

public class Solution {
    
    public static int anyBaseToDecimal(int n,int b){
        int ans = 0,power=1;
        
        while(n>0){
            int rem = n%10;
            ans = ans + (rem*power);
            n/=10;
            power *=b;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        
        System.out.println(anyBaseToDecimal(n,b));
    }
}
