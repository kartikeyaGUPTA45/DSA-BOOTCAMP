import java.io.*;
import java.util.*;

public class Solution {
    public static void printPermutations(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<ques.length();i++){
            char ch = ques.charAt(i);
            String ros = ques.substring(0,i) + ques.substring(i+1);
            printPermutations(ros,ans + ch);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        printPermutations(scn.next(), "");
    }
}
