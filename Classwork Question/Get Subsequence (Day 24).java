import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static ArrayList<String> getSub(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> subAns = getSub(ros);
        
        ArrayList<String> ans = new ArrayList<>();
        // Exclude
        for(int i=0;i<subAns.size();i++){
            ans.add(subAns.get(i));
        }
        
         // Include
        for(int i=0;i<subAns.size();i++){
            ans.add(ch+subAns.get(i));
        }
        
        return ans;
        
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        System.out.println(getSub(str));
    }
}
