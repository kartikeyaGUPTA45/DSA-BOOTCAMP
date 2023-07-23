import java.io.*;
import java.util.*;

public class Solution {
    public static String checkAnagram(String str1, String str2){
        int freq[] = new int[26];
        
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']+=1;
        }
        
        for(int i=0;i<str2.length();i++){
            freq[str2.charAt(i)-'a']-=1;
        }
        
        for(int i=0;i<26;i++){
            if(freq[i] != 0){
                return "False";
            }
        }
        
        return "True";
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        
        System.out.println(checkAnagram(str1,str2));
    }
}
