import java.io.*;
import java.util.*;

public class Solution {
    public static int targetString(String str, String target){
        for(int i=0;i<str.length()-target.length()+1;i++){
            int start = i;
            boolean flag = true;
            for(int j=0;j<target.length();j++){
                if(target.charAt(j) != str.charAt(i+j)){
                    flag = false;
                    break;
                }
            }
            if(flag == true) return i;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String target = scn.next();
        System.out.println(targetString(str,target));
    }
}
