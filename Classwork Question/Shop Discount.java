import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int b =scn.nextInt();
        
        int totalPrice = b*100;
        
        if (totalPrice > 1000){
            totalPrice -= (totalPrice*0.1);
        }
        
        System.out.println(totalPrice);
    }
}
