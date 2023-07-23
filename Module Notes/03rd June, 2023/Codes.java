import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        if(num%2 == 0){
            System.out.println("Even number");
            // num += 5;
            // num -= 10;
            // num = num+5-10;
            num -= 5;
            if(num >= 0){
                System.out.println("Positive");
            }else{
                System.out.println("Negative");
            }
        }else{
            System.out.println("Odd number");
            num +=7;
            num -= 100;
            
            if (num % 2 == 0){
                System.out.println("Even number");
            }else{
                System.out.println("Odd number");
            }
        }
    }
}
