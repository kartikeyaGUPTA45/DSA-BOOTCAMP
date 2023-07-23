import java.io.*;
import java.util.*;

public class Solution {
    
    public static String searchCharacter(char arr[], char ch, int n){
        for(int i=0;i<n;i++){
            char c = arr[i];
            if (c>ch){
                return c+"";
            }
        }
        
        return "-1";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        int n =scn.nextInt();
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.next().charAt(0);
        }
        
        System.out.println(searchCharacter(arr,ch,n));
    }
}
