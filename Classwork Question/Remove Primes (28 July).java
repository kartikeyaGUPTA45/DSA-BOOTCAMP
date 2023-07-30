import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean checkPrime(int x){
        for(int i=2;i*i<=x;i++){
            if(x%i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    public static void removePrimes(ArrayList<Integer> arr){
        for(int i=arr.size()-1;i>=0;i--){
            if(checkPrime(arr.get(i)) == true){
                arr.remove(i);
            }
        }
        
        System.out.print(arr);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            arr.add(scn.nextInt());
        }
        
        removePrimes(arr);
    }
}
