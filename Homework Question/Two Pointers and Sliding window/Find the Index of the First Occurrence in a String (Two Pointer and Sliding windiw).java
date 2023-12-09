import java.io.*;
import java.util.*;

public class Solution {
    public static int isPresent(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return -1;
        }
        for(int i=0;i<=str1.length()-str2.length();i++) {
            int j =0;
            while(j<str2.length()) {
                if (str1.charAt(i+j) != str2.charAt(j)) {
                    break;
                }
                j++;
            }
            
            if (j == str2.length()) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        
        System.out.println(isPresent(str1,str2));
    }
}
