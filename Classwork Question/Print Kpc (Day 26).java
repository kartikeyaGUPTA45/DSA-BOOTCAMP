import java.io.*;
import java.util.*;

public class Solution {
    public static String [] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        
        char ch = ques.charAt(0);
        String ros = ques.substring(1);
        
        String str = arr[ch-'0'];
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            printKPC(ros,ans + c);
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        // String ques = scn.next();
        // printKPC(ques,"");
        printKPC(scn.next(), "");
    }
}
