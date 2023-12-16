import java.io.*;
import java.util.*;

public class Solution {
    public static List<String> groupAnagrams(String [] strs, int n) {
        HashMap<String,List<String>>map = new HashMap<>();
        
        for(int i=0;i<n;i++) {
            String str = strs[i];
            char ch [] = str.toCharArray();
            Arrays.sort(ch);
            str = String.valueOf(ch);
            
            if(map.containsKey(str)) {
                List<String> ans = map.get(str);
                ans.add(strs[i]);
            } else {
                List<String> ans = new ArrayList<>();
                ans.add(strs[i]);
                map.put(str,ans);
            }
        }
        
        List<String> res = new ArrayList<>();
        for(String key:map.keySet()) {
            res.addAll(map.get(key));
        }
        
        return res;
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String strs[] = new String[n];
        for(int i=0;i<n;i++) {
            strs[i] = scn.next();
        }
        
        List<String> ans = groupAnagrams(strs,n);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
