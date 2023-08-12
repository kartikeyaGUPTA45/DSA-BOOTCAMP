import java.io.*;
import java.util.*;

public class Solution {
    public static void printEncodings(String ques,String ans){
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        char ch = ques.charAt(0);
        if(ch == '0'){
            return;
        }
        int num1 = ch-'0';
        char decoding1 = (char)(num1-1+'a');
        String ros1 = ques.substring(1);
        printEncodings(ros1, ans + decoding1);
        
        if(ques.length() >= 2){
            int num = Integer.parseInt(ques.substring(0,2));
            if(num <=26){
                char decoding2 = (char)(num+'a'-1);
                // System.out.println(num);
                String ros2 = ques.substring(2);
                printEncodings(ros2, ans + decoding2);
            }
            
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        printEncodings(scn.next(),"");
    }
}
