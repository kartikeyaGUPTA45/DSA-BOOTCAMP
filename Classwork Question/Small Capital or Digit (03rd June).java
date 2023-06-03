import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        char ch = scn.nextLine().charAt(0);
        
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Small case");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Capital case");
        }
        else if(ch >= '0' && ch <='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("None");
        }
    }
}
