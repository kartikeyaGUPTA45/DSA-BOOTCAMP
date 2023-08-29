import java.io.*;
import java.util.*;

public class Solution {

    public static int precedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else return 0;
    }  
    
    
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
        Stack<Character> st2 = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if (ch == '('){
                st2.push(ch);
            } else if (ch == ')'){
                while(st2.peek() != '('){
                    char op = st2.pop();
                    int b = st1.pop();
                    int a = st1.pop();
                    int ans = operation(a,b,op);
                    st1.push(ans);
                }
                st2.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(st2.size() >0 && precedence(ch) <= precedence(st2.peek())){
                    char op = st2.pop();
                    int b = st1.pop();
                    int a = st1.pop();
                    int ans = operation(a,b,op);
                    st1.push(ans);
                }
                st2.push(ch);
            } else if (ch >='0' && ch <='9'){
                st1.push(ch-'0');
            }
        }
        
        while(st2.size() > 0){
            char op = st2.pop();
            int b = st1.pop();
            int a = st1.pop();
            int ans = operation(a,b,op);
            st1.push(ans);
        }
        
        
        System.out.println(st1.peek());
        
    }
}
