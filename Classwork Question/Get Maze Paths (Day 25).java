import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static ArrayList<String> getMazePaths(int sr,int sc, int dr, int dc){
        if(sc> dc || sr>dr){
            return new ArrayList<>();
        }
        
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> subAns1 = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> subAns2 = getMazePaths(sr+1, sc, dr, dc);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i=0;i<subAns1.size();i++){
            ans.add("h" + subAns1.get(i));
        }
        
        for(int i=0;i<subAns2.size();i++){
            ans.add("v" + subAns2.get(i));
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }
}
