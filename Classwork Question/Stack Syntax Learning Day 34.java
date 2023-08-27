import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<t;i++){
            int c = scn.nextInt();
            if(c == 1){
                System.out.println(st.size());
            }else if (c == 2){
                if(st.size() == 0) System.out.println(-1);
                else  st.pop();
            }else if(c == 3){
                int x = scn.nextInt();
                st.push(x);
            }else{
                if(st.size() == 0) System.out.println(-1);
                else System.out.println(st.peek());
            }
        }
    }
}
