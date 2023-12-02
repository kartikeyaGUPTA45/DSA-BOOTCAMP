import java.io.*;
import java.util.*;

public class Solution {
    public static void pT(int n) {
        if (n == 0) {
            return;
        }
        
        for(int i=1;i<=n;i++) {
            System.out.print("*");
        }
        System.out.println();
        pT(n-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pT(n);
    }
}
