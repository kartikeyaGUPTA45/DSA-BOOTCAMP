import java.io.*;
import java.util.*;

public class Solution {
    public static void sBoard(int currpos, String ans, int n, int m, ArrayList<String> paths){
        if(currpos > n) return ;
        
        if(currpos == n){
            paths.add(ans);
            return;
        }
        
        for(int i=1;i<=m;i++){
            sBoard(currpos+i, ans+i, n , m, paths);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        ArrayList<String> paths = new ArrayList<>();
        
        sBoard(0,"",n,m,paths);
        System.out.println(paths.size());
        System.out.println(paths);
        
        for(int i=0;i<paths.size();i++){
            System.out.println(paths.get(i));
        }
    }
}
