import java.io.*;
import java.util.*;

public class Solution {

    public static void printPattern(){
        int nsp = 0,nst = 5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print(". ");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        printPattern();
    }
}
