import java.io.*;
import java.util.*;

public class Solution {
    public static int anyBaseAddition(int n1,int n2,int b){
        int ans = 0,power=1,carry=0;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int rem = carry;
            if(n1>0) rem += n1%10;
            if(n2>0) rem += n2%10;
            
            n1/=10;
            n2/=10;

            ans += (power*(rem%b));
            carry = rem/b;
            power *= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        System.out.println(anyBaseAddition(n1,n2,b));
    }
}
