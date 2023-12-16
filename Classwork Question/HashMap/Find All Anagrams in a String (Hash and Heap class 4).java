import java.io.*;
import java.util.*;

public class Solution {
    public static void findAnagrams(String s, String p) {
        if(p.length() > s.length()) {
            return;
        }
        
        int s_freq[] = new int[26];
        int p_freq[] = new int[26];
        
        int i=0,j=0;
        while(i<p.length()) {
            s_freq[s.charAt(i)-'a']++;
            p_freq[p.charAt(i)-'a']++;
            i++;
        }
        i--;
        while(i<s.length()) {
            if(Arrays.equals(s_freq,p_freq)) {
                System.out.print(j + " ");
            }
            i++;
            if(i<s.length())
                s_freq[s.charAt(i)-'a']++;
            s_freq[s.charAt(j)-'a']--;
            
            j++;
        }
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String p = scn.next();
        
        findAnagrams(s,p);
    }
}
