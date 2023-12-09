import java.io.*;
import java.util.*;

public class Solution {
    public static int longestSubstring(String str) {
        int left =0,right = 0, maxLen = 0, count =0;
        
        int freq[] = new int[128];
        
        while(right<str.length()) {
            char ch = str.charAt(right);
            if(freq[ch] == 1) count++;
            
            freq[ch]++;
            right++;
            
            while(count>0) {
                char ch1 = str.charAt(left);
                if (freq[ch1] == 2) count--;
                
                freq[ch1]--;
                left++;
            }
            
            maxLen = Math.max(maxLen, right-left);
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(longestSubstring(str));
    }
}
