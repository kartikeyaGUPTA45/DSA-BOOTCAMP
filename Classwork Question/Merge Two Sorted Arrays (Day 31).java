import java.io.*;
import java.util.*;

public class Solution {
    public static void mergeTwoSortedArrays(int a[],int b[],int n1,int n2){
        int res[]= new int[n1+n2];
        
        int i=0,j=0,k=0;
        
        while(i<n1 && j<n2){
            if(a[i] > b[j]){
                res[k] = b[j];
                k++;
                j++;
            }else{
                res[k] = a[i];
                i++;
                k++;
            }
        }
        
        while(i<n1){
            res[k] = a[i];
            i++;
            k++;
        }
        
        while(j<n2){
            res[k] = b[j];
            j++;
            k++;
        }
        
        
        for(i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a[]= new int[n1];
        for(int i=0;i<n1;i++){
            a[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int b[] = new int[n2];
        for(int i=0;i<n2;i++){
            b[i] = scn.nextInt();
        }
        
        mergeTwoSortedArrays(a,b,n1,n2);
    }
}
