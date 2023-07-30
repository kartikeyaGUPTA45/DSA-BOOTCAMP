import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void printArrayList(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
       ArrayList<Integer>arr = new ArrayList<>();
        
        int n =scn.nextInt();
        for(int i=0;i<n;i++){
            arr.add(scn.nextInt());
        }
        
        printArrayList(arr);
    }
}
