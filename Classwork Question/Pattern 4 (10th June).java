import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1,nst = n, nsp = 0;
        
        while(row <=n){
            for(int i=1;i<=nsp;i++){
                System.out.print("\t");
            }
            for(int i=1;i<=nst;i++){
                System.out.print("*\t");
            }
            
            row++;
            nsp++;
            nst--;
            System.out.println();
        }
    }
}
