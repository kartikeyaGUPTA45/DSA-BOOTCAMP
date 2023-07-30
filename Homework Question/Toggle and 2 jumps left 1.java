import java.io.*;
import java.util.*;

public class Solution {
    public static String toggleAndJump(char ch){
        if(ch >= 'a' && ch <= 'z'){
            ch = (char)(ch-'a'+'A');
        }else if(ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch-'A'+'a');
        }else {
            return "No alphabet";
        }
        
        if(ch == 'a' || ch == 'b' || ch == 'A' || ch == 'B'){
            return "Sorry";
        }else{
            return (char)(ch-2)+"";
        }
    } 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        
        System.out.println(toggleAndJump(ch));
    }
}
