import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            // int value = map.getOrDefault(ch,0);
            // map.put(ch,value+1);
            
            if(map.containsKey(ch)) {
                int value = map.get(ch);
                map.put(ch,value+1);
            } else {
                map.put(ch,1);
            }
        }
        
        Set<Character> keys = map.keySet();
        Character  ch = str.charAt(0);
        for(Character key:keys) {
            if (map.get(ch) < map.get(key)) {
                ch = key;
            }
        }
        
        System.out.println(ch);
        
    }
}
