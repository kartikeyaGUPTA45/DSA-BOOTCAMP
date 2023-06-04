import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        char ch = scn.nextLine().charAt(0);
        
        if(ch >= 'a' && ch <='z'){
            ch = (char)(ch -'a' + 'A');
        }else{
            ch = (char)(ch-'A'+'a');
        }
        
        System.out.println(ch);
    }
}
