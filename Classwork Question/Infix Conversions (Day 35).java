import java.io.*;
import java.util.*;

public class Solution {
    public static int precedence(char ch){
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else return 0;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        Stack<Character> st1 = new Stack<>(); // operators and opening bracket
        Stack<String> st2 = new Stack<>(); // postfix exp
        Stack<String> st3 = new Stack<>(); // prefix exp
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if (ch == '('){
                st1.push(ch);
            } else if (ch == ')') {
                while(st1.peek() != '('){
                    char op = st1.pop();
                    String postfixopp2 = st2.pop();
                    String postfixopp1 = st2.pop();
                    
                    st2.push(postfixopp1 + postfixopp2 + op);
                    
                    String prefixopp2 = st3.pop();
                    String prefixopp1 = st3.pop();
                    
                    st3.push(op + prefixopp1 + prefixopp2);
                }
                st1.pop(); // poping opening bracket
                
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(st1.size() >0 && precedence(ch) <= precedence(st1.peek())){
                     char op = st1.pop();
                    String postfixopp2 = st2.pop();
                    String postfixopp1 = st2.pop();
                    
                    st2.push(postfixopp1 + postfixopp2 + op);
                    
                    String prefixopp2 = st3.pop();
                    String prefixopp1 = st3.pop();
                    
                    st3.push(op + prefixopp1 + prefixopp2);
                }
                st1.push(ch);
            } else if (ch >='a' && ch <= 'z'){
                st2.push(ch + "");
                st3.push(ch + "");
            }
        }
        
        while(st1.size() > 0 ){
             char op = st1.pop();
            String postfixopp2 = st2.pop();
            String postfixopp1 = st2.pop();

            st2.push(postfixopp1 + postfixopp2 + op);

            String prefixopp2 = st3.pop();
            String prefixopp1 = st3.pop();

            st3.push(op + prefixopp1 + prefixopp2);
        }
        
        System.out.println(st2.pop());
        System.out.println(st3.pop());
    }
}
