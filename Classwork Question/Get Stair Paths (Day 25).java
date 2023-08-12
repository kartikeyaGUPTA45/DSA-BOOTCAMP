import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static ArrayList<String> getStairPaths(int n){
        if(n<0){ // negative base case
            ArrayList<String> base2 = new ArrayList<>();
            return base2;
            
            // return new ArrayList<>();
        }
        
        if(n == 0){ // positive base case
            ArrayList<String> base1 = new ArrayList<>();
            base1.add("");
            return base1;
        }
        
        ArrayList<String> subAns1 = getStairPaths(n-1); // 1 step
        ArrayList<String> subAns2 = getStairPaths(n-2); // 2 steps
        ArrayList<String> subAns3 = getStairPaths(n-3); // 3 steps
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i=0;i<subAns1.size();i++){
            ans.add("1"+subAns1.get(i));
        }
        
        for(int i=0;i<subAns2.size();i++){
            ans.add("2"+subAns2.get(i));
        }
        
        for(int i=0;i<subAns3.size();i++){
            ans.add("3"+subAns3.get(i));
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        
        System.out.println(getStairPaths(n));
    }
}
