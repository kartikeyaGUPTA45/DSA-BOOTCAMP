import java.io.*;
import java.util.*;

public class Solution {
    public static int longestSubstring(String str, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int len = 0;
        int i=0,j=0;
        while(j<str.length()) {
            char ch = str.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            if (map.size() > k) {
                ch = str.charAt(i);
                if(map.containsKey(ch)) {
                    if(map.get(ch) == 1) {
                        map.remove(ch);
                    } else {
                        map.put(ch,map.get(ch)-1);
                    }
                    i++;
                }
            }
            
            len = j-i+1;
            ans = Math.max(ans,len);
            j++;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();
        
        System.out.println(longestSubstring(str,k));
    }
}
