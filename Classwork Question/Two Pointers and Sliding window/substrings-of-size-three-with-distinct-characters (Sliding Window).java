import java.io.*;
import java.util.*;

public class Solution {
    public static int goodString(String str) {
        int count = 0;
        for(int i=0;i<str.length()-2;i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            char ch3 = str.charAt(i+2);
            
            if (ch1 != ch2 && ch2 != ch3 && ch3 != ch1) {
                count++;
            } 
        }
        
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(goodString(str));
    }
}
