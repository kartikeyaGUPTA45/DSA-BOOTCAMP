import java.io.*;
import java.util.*;

public class Solution {
    public static void divide(int n,int steps){
        while(n%2==0){
            steps+=2;
            n/=2;
        }
        
        while(n%3==0){
            steps+=3;
            n/=3;
        }
        
        while(n%5==0){
            steps+=5;
            n/=5;
        }
        
        System.out.println(steps);
        System.out.println(n);
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int steps=scn.nextInt();
        
        divide(n,steps);
    }
}
