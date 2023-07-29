import java.io.*;
import java.util.*;

public class Solution {
    public static String targetString(String str1, String str2){
        char  ch =str1.charAt(0);
        int startingIndex = -1;
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i) == ch) {
                startingIndex = i;
                break;
            }
        }
        
        String str = str2.substring(startingIndex, str2.length()) + str2.substring(0,startingIndex);
        
        return str1.equals(str) == true? "True" : "False";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        
        System.out.println(targetString(str1,str2));
    }
}
