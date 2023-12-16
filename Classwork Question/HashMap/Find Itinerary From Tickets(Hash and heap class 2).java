import java.io.*;
import java.util.*;

public class Solution {
    public static void findItinerary(HashMap<String,String> input, int n) {
        HashMap<String,Boolean> map = new HashMap<>();
        for(String src: input.keySet()) {
            String dest = input.get(src);
            
            map.put(dest,false);
            if(map.containsKey(src) == false) {
                map.put(src,true);
            }
        }
        
        String startingPt = "";
        for(String key : map.keySet()) {
            boolean value = map.get(key);
            if (value == true) {
                startingPt = key;
                break;
            }
        }
        
        while(true) {
            if(input.containsKey(startingPt)) {
                System.out.print(startingPt + " -> ");
                startingPt = input.get(startingPt);
            } else {
                System.out.print(startingPt + ".");
                break;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashMap<String,String> input = new HashMap<>();
        for(int i=0;i<n;i++){
            String str1 = scn.next();
            String str2 = scn.next();
            input.put(str1,str2);
        }
        
        findItinerary(input, n); 
    }
}
