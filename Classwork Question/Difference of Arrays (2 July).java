import java.io.*;
import java.util.*;

public class Solution {
    
    public static void differenceOfArrays(int a1[],int a2[],int n1,int n2){
        int ans[] = new int [n2];
        int i = n1-1;
        int j = n2-1;
        int k = n2-1;
        int borrow = 0;
        
        while(k>=0){
            int diff = a2[j]-borrow;
            
            if(i>=0){
                diff -= a1[i];
            }
            
            if(diff >=0){
                borrow=0;
            }else{
                diff += 10;
                borrow=1;
            }
            
            ans[k] = diff;
            i--;
            j--;
            k--;
        }
        
        i = 0;
        for(i=0;i<n2;i++){
            if(ans[i] !=0){
                break;
            }
        }
        
        for(;i<n2;i++){
            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a1[] = new int[n1];
        for(int i=0;i<n1;i++){
            a1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int a2[] = new int[n2];
        for(int i=0;i<n2;i++){
            a2[i] = scn.nextInt();
        }
        
        differenceOfArrays(a1,a2,n1,n2);
        
    }
}
