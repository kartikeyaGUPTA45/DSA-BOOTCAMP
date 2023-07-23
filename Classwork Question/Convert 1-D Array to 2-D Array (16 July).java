import java.io.*;
import java.util.*;

public class Solution {
    public static void convert1DTo2D(int a[],int N,int p,int q){
        int arr[][] = new int[p][q];
        
        int count =0;
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr[i][j] = a[count];
                count++;
            }
        }
        
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int a[] = new int[N];
        
        for(int i=0;i<N;i++){
            a[i] = scn.nextInt();
        }
        
        int p =scn.nextInt();
        int q = scn.nextInt();
        
        convert1DTo2D(a,N,p,q);
    }
}
