import java.io.*;
import java.util.*;

public class Solution {
    public static void pdi(int n) {
        if(n == 0) {
            return;
        }
        
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        pdi(n);
    }
}
