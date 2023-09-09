import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int tntbt(int tickets[], int n, int k){
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            q.add(i);
        }
        
        int ans = 0;
        while(q.size()>0){
            int index = q.poll();
            
            tickets[index]--;
            ans++;
            
            if(tickets[index] == 0 && index == k){
                return ans;
            } 
            
            if(tickets[index] != 0){
                q.add(index);
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int tickets[]= new int [n];
        for(int i=0;i<n;i++){
            tickets[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        
        System.out.println(tntbt(tickets,n,k));
    }
}
