import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int age=scn.nextInt();
        
        if(age>=70){
            System.out.println("Super Senior Citizen");
        }
        else if(age>=59){
            System.out.println("Senior Citizen");
        }
        else if(age>=18){
            System.out.println("Adult");
        }else if(age>=1){
            System.out.println("Underage");
        }else{
            System.out.println("New Born");
        }
    }
}
