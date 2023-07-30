import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int A =scn.nextInt();
        int B =scn.nextInt();
        int C =scn.nextInt();
        int D =scn.nextInt();
        int E =scn.nextInt();
        int F =scn.nextInt();
        int G =scn.nextInt();
        
        System.out.println((A+B+C)*(D+E+F+G));
    }
}
