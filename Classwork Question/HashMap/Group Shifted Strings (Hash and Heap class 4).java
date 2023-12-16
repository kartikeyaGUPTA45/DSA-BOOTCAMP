import java.io.*;
import java.util.*;

public class Solution {
    public static List<String> shiftedStringGroup(String [] strs, int n) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            String str = strs[i];
            int offset = str.charAt(0)-'a';
            String key = "";
            for(int j=0;j<str.length();j++) {
                char c = (char)(str.charAt(j)-offset);
                if (c<'a') c+=26;
                key += c;
            }
            if(map.containsKey(key)) {
                List<String> values = map.get(key);
                values.add(str);
            } else {
                List<String> values = new ArrayList<>();
                values.add(str);
                map.put(key,values);
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
        
        List<String> ans = shiftedStringGroup(strs, n);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
