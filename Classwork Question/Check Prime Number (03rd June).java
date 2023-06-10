import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean flag = true;
        for(int i = 2 ;i *i <= n;i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        
        if (flag == true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
