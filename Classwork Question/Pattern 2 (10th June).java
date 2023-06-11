import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int row = n;
        while(row>0){
            int stars = 1;
            while(stars <=row){
                System.out.print("*\t");
                stars++;
            }
            row--;
            System.out.println();
        }
    }
}
