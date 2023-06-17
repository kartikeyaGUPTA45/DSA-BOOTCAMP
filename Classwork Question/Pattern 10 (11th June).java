import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=0;i<n;i++){
            int val = 1;
            for(int j=0;j<=i;j++){
                System.out.print(val + " ");
                val = (val*(i-j))/(j+1);
            }
            System.out.println();
        }
    }
}
