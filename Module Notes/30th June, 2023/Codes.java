import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        
        int ans = 0,power =1;
        
        while(n>0){
            ans += power*(n%b);
            n = n/b;
            power*=10;
        }
        
        System.out.println(ans);
        
    }
}


// Any Base To Decimal 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        
        int ans = 0,power =1;
        while(n>0){
            ans += (power*(n%10));
            n /=10;
            power*=b;
        }
        System.out.println(ans);
    }
}
