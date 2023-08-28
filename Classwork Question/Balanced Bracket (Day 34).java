import java.io.*;
import java.util.*;

public class Solution {
    public static boolean balanceBracket(String str){
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')' || ch == ']' || ch == '}'){
                if(st.size() == 0) return false; // more closing brackets
                
                // Line no. 17 - 28 => Mismatch of brackets
                else if(ch == ')'){
                    if(st.peek() != '(') return false;
                }
                
                else if(ch == ']'){
                    if(st.peek() != '[') return false;
                }
                
                else if(ch == '}'){
                    if(st.peek() != '{') return false;
                }
                
                st.pop();
            }
        }
        
        if(st.size() == 0) return true;
        return false; // more opening brackets
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(balanceBracket(str));
    }
}
