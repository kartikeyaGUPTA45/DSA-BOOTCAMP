import java.io.*;
import java.util.*;

public class Solution {
    public static void printPattern(){
        int nst = 1;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(". ");
            }
            if(i<5) nst++;
            else nst--;
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        printPattern();
    }
}
