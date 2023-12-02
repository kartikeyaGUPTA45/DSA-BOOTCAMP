import java.io.*;
import java.util.*;

public class Solution {
    public static void pzz(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        pzz(n);
    }
}
