import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void reversePrinting(ArrayList<Integer> arr){
        
        ArrayList<Integer> reverseArr = new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            reverseArr.add(arr.get(i));
        }
        
        
        for(Integer ele : reverseArr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            arr.add(scn.nextInt());
        }
        
    
        reversePrinting(arr);
    }
}
