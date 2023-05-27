import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int one = scn.nextInt();
        int two = scn.nextInt();
        int three = scn.nextInt();
        int four = scn.nextInt();
        int five = scn.nextInt();
        
        int answer = one * two * three * four * five;
        System.out.println(answer);
    }
}
