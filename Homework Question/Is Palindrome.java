import java.io.*;
import java.util.*;

public class Solution {
    public static String isPalindrome(String str){
        int left=0;
        int right = str.length()-1;
        
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return "Not a Palindrome";
            }
            left++;
            right--;
        }
        
        return "Palindrome";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(isPalindrome(str));
    }
}
