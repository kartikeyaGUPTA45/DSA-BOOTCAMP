// Without function 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr [] = new int[n];
        
//         User Input for array
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }

//         Printing elements of array
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

// With function:
import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printArrayElements(int arr[]){
        // int n =arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr [] = new int[n];
        
//         User Input for array
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        printArrayElements(arr);
    }
}
