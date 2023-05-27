import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int number  = scn.nextInt();
        
//         1 -> multiply with 3, 2-> add 7 to it, 3-> subtract 10 from it 
        number *=3;
        number +=7;
        number -= 10;
        
        System.out.println(number);
    }
}
