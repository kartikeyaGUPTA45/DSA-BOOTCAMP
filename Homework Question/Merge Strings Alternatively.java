import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String mergeAlternatively(String str1, String str2){
        String ans = "";
        int i =0;
        while(i<str1.length()){
            ans = ans + str1.charAt(i) +str2.charAt(i);
            i++;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        
        System.out.println(mergeAlternatively(str1,str2));
    }
}
