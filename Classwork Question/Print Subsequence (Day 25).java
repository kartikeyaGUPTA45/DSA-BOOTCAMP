import java.io.*;
import java.util.*;

public class Solution {
    public static void printSS(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return ;
        }
        
        char ch = ques.charAt(0);
        String ros = ques.substring(1);
//         Include
        printSS(ros, ans + ch);
//         Exclude
        printSS(ros,ans);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String ques = scn.next();
        printSS(ques, "");
    }
}
