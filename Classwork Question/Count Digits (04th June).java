import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        int count = 0;
        
       for(int i=num ; i>0 ; i/=10){
           count +=1;
       }
        
        System.out.println(count);
    }
}
