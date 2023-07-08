import java.io.*;
import java.util.*;

public class Solution {
    public static int maxOfArray(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        
        return max;
    }
    
    public static void printChart(int arr[], int max){
        for(int i=1;i<=max;i++){
            for(int j=0;j<arr.length;j++){
                int val = arr[j];
                if(val>max-i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int maxElement = maxOfArray(arr);
        printChart(arr,maxElement);
    }
}
