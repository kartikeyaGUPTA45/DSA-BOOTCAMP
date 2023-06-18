import java.io.*;
import java.util.*;

public class Solution {
    
    public static int anyBasetoDecimal(int n,int b){
        int ans=0, power =1;
        
        while(n>0){
            int rem = n%10;
            ans = ans+(power*rem);
            n/=10;
            power*=b;
        }
        
        return ans;
        
    }
    
    public static int decimalToAnyBase(int n, int b){
        int ans=0,power = 1;
        
        while(n>0){
            int rem = n%b;
            ans = ans+(power*rem);
            n/=b;
            power*=10;
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        
        int ans1 = anyBasetoDecimal(n,b1);
        int finalAnswer = decimalToAnyBase(ans1,b2);
        System.out.println(finalAnswer);
    }
}
