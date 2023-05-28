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
        
        one *= 2 ;
        two *= 2;
        three *= 2;
        four *= 2;
        five *= 2;
        
        int answer =one + two + three + four + five;
        
        System.out.println(answer);
    }
}
