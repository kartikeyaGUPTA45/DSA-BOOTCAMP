import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void kFrequentCharacters(String str,int k){
        int freqArr [] =  new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                freqArr[ch-'a']++;
            }else if(ch>='A' && ch <='Z'){
                freqArr[ch-'A']++;
            }
        }
        
       
        for(int i=1;i<=k;i++){
            int maxFreq = 0;
            int maxFreqIndex = 0;
            char maxCh = 'a';
            
            for(int j=0;j<26;j++){
                if(freqArr[j] > maxFreq){
                    maxFreqIndex = j;
                    maxFreq = freqArr[j];
                    maxCh = (char)(j+'a');
                }
            }
            
            System.out.print(maxCh + " ");
            freqArr[maxFreqIndex] = -1;
            
            
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();
        
        kFrequentCharacters(str,k);
    }
}
