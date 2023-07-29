import java.io.*;
import java.util.*;

public class Solution {
    public static void printFizzBuzz(int n){
        if(n%3 == 0){
            System.out.print("Fizz");
        }
        if(n%7 == 0){
            System.out.print("Buzz");
        }
        else if(n%3 != 0){
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printFizzBuzz(n);
    }
}
