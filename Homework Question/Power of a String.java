import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int powerOfString(String str){
        
        int i=1, maxLen = 1, currLen =1;
        char ch = str.charAt(0);
        while(i<str.length()){
            if(ch == str.charAt(i)) currLen +=1;
            else{
                if(maxLen < currLen) maxLen = currLen;
                currLen =1;
                ch = str.charAt(i);
            }
            i++;
        }
        if(currLen > maxLen) currLen = maxLen;
        
        return maxLen;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(powerOfString(str));
    }
}
