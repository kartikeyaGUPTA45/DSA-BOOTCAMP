import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int marks = 95;
        
        
        if (marks > 90){
            System.out.println("A1");
        }
        else if(marks > 80){
            System.out.println("A2");
        }
        else if(marks > 70){
            System.out.println("B1");
        }
        else if (marks > 60){
            System.out.println("B2");
        }
        else {
            System.out.println("C");
        }
    }
}
