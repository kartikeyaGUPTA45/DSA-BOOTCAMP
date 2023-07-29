import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int lastOcuurenceOfGivenCharacter(String str, char ch){
        int index = -1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch) index = i;
        }
        
        return index;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        String str=scn.nextLine();
        char ch1=scn.nextLine().charAt(0);
        char ch2=scn.nextLine().charAt(0);
        
        int index1=lastOcuurenceOfGivenCharacter(str,ch1);
        int index2=lastOcuurenceOfGivenCharacter(str,ch2);
        
        System.out.println(Math.abs(index1-index2)-1);
    }
}
