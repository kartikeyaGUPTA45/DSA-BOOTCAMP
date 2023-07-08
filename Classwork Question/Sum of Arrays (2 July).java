import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a1 [] = new int [n1];
        for(int i=0;i<n1;i++){
            a1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int a2 [] = new int [n2];
        for(int i=0;i<n2;i++){
            a2[i] = scn.nextInt();
        }
        
        int a3 [] = new int [n2>n1?n2:n1];
        int i=n1-1,j=n2-1,k=a3.length-1,carry = 0;
        
        while(i>=0 || j>=0 || k>=0){
            int sum = 0;
            if(i>=0) sum += a1[i];
            if(j>=0) sum += a2[j];
            sum += carry;
            
            a3[k] = sum%10;
            carry = sum/10;
            
            i--;
            j--;
            k--;
         }
        
        if(carry > 0){
            System.out.println(carry);
        }
        
        for(i=0;i<a3.length;i++){
            System.out.println(a3[i]);
        }
         
    }
}
