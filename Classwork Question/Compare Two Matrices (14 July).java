import java.io.*;
import java.util.*;

public class Solution {
    
    public static String compareMatrices(int arr1[][], int arr2[][]){
        if(arr1.length != arr2.length || arr1[0].length != arr2[0].length){
            return "Not Same";
        }
        
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                if(arr1[i][j] != arr2[i][j]){
                    return "Not Same";
                }
            }
        }
        
        return "Same";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner (System.in);
        int m1 = scn.nextInt();
        int n1 = scn.nextInt();
        int arr1[][] = new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        
        int m2 = scn.nextInt();
        int n2 = scn.nextInt();
        int arr2[][] = new int[m2][n2];
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(compareMatrices(arr1,arr2));
    }
}
