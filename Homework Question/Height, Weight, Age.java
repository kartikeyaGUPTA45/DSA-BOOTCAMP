import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int height =scn.nextInt();
        int weight =scn.nextInt();
        int age =scn.nextInt();
        
        if(height == 5 && weight == 50 && age == 10){
            System.out.println("Overweight");
        }else if(height == 5 && weight == 60){
            System.out.println("Fat");
        }else if(height == 6 && weight == 50){
          System.out.println("Slim");
        }else{
            System.out.println("None");
        }
        
    }
}
