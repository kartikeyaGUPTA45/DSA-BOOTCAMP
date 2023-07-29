import java.io.*;
import java.util.*;

public class Solution {
    public static void printPattern(){
        int nst1 =1,nst2 = 9;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j == nst1 || j == nst2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            nst1++;
            nst2--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        printPattern();
        
    }
}
