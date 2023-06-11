import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int nst1 = n/2+1, nst2 = n/2+1, nsp =1;
        
        for(int i=0;i<n;i++){
            for(int j=1;j<=nst1;j++){
                System.out.print("*");
            }
            
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=nst2;j++){
                System.out.print("*");
            }
            
            if(i<n/2){
                nst1-=1;
                nst2-=1;
                nsp+=2;
            }
            else{
                nst1+=1;
                nst2+=1;
                nsp-=2;
            }
            
            System.out.println();
        }
    }
}
