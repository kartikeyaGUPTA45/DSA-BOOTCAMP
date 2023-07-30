import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int x=scn.nextInt();
        int y=scn.nextInt();
        
        long sum=(long)x+y;
        
        if(sum>=100){
            System.out.println("High Sum");
        }else {
            System.out.println("Low Sum");
        }
    }
}
