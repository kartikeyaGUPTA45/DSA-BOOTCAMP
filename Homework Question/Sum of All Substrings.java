import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int sumOfAllSubstrings(String str){
        
        int sum=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                int num=0;
                for(int k=i;k<=j;k++){
                    int digit=str.charAt(k)-'0';
                    num=num*10+digit;
                }
                sum+=num;
            }
        }
        
        return sum;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        
        int ans=sumOfAllSubstrings(str);
        System.out.println(ans);
    }
}
