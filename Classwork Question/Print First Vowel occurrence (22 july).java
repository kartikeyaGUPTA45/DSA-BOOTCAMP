import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        
        return false;
    }
    
    public static int firstVowelOccurence(char arr[], int n){
        for(int i=0;i<n;i++){
            if(checkVowel(arr[i]) == true){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.next().charAt(0);
        }
        
        System.out.println(firstVowelOccurence(arr,n));
    }
}
