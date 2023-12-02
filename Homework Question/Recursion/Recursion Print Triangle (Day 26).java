import java.io.*;
import java.util.*;

public class Solution {
    public static void pT(int row, int n) {
        if(row > n) {
            return;
        }
        
        for(int i=1;i<=row;i++) {
            System.out.print("*");
        }
        
        System.out.println();
        pT(row+1,n);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pT(1,n);
    }
}
