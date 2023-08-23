import java.io.*;
import java.util.*;

public class Solution {
    public static void combinations1(int cbox,int nboxes,int citem,int items,String ans){
        // items -> choices, box -> placeholder
        if(cbox>nboxes){
            if(citem == items){
                System.out.println(ans);
            }
            return;
        }
        
        combinations1(cbox+1,nboxes,citem+1,items,ans+"i");
        combinations1(cbox+1,nboxes,citem,items,ans+"-");
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int nboxes = scn.nextInt();
        int items = scn.nextInt();
        
        combinations1(1,nboxes,0,items,"");
    }
}
