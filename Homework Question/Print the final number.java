import java.io.*;
import java.util.*;

public class Solution {
    public static Scanner scn=new Scanner(System.in);
   
    
    public static int formNumber(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            int x=scn.nextInt();
            ans=ans*10+x;
        }
        
        return ans;
    
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        int n=scn.nextInt();
        int ans=formNumber(n);
        
        System.out.println(ans);
    }
}
