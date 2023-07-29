import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
        public static boolean isEqual(int arr1[],int arr2[]){
            int n1=arr1.length;
            int n2=arr2.length;
            
            if(n1!=n2){
                return false;
            }
            
            for(int i=0;i<n1;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
        
            return true;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n1=scn.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }
        
        int n2=scn.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }
        
        boolean ans=isEqual(arr1,arr2);
        System.out.println(ans);
    }
}
