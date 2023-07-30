import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int marks=scn.nextInt();
        
        if(marks<33){
            marks+=4;
        }
        
        System.out.println(marks);
    }
}
