import java.io.*;
import java.util.*;

public class Solution {
    public static int operation(int a, int b, char ch){
        if (ch == '+') return a+b;
        else if (ch == '-') return a-b;
        else if (ch == '*') return a*b;
        else return a/b;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        Stack<Integer> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>(); // For Infix
        Stack<String> st3 = new Stack<>(); // For Prefix
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if (ch >= '0' && ch <='9'){
                st1.push(ch - '0');
                st2.push(ch + "");
                st3.push(ch + "");
            } else {
                int b = st1.pop();
                int a = st1.pop();
                st1.push(operation(a,b,ch));
                
                String op2 = st2.pop();
                String op1 = st2.pop();
                
                st2.push('(' + op1 + ch + op2 +')');
                
                op2 = st3.pop();
                op1 = st3.pop();
                
                st3.push(ch + op1 + op2);
            }
        }
        
        System.out.println(st1.pop());
        System.out.println(st2.pop());
        System.out.println(st3.pop());
    }
}
