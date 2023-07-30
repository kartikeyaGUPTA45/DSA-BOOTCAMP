import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int age =scn.nextInt();
        int salary= scn.nextInt();
        
        if(age>60) salary += 1000;
        else if(age>40) salary += 500;
        
        System.out.println(salary);
    }
}
