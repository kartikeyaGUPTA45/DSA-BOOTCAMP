import java.io.*;
import java.util.*;

public class Solution {
    public static boolean validPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <='z') {
                sb.append(ch);
            } else if (ch >= '0' && ch <='9') {
                sb.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch-'A'+'a');
                sb.append(ch);
            }
        }
        
        str = sb.toString();
        
        int left = 0, right = str.length()-1;
        
        while(left<right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(validPalindrome(str));
    }
}
