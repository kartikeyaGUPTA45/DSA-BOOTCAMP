import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int i=low; i<=high;i++){
            int num = i;
            boolean flag = true;
            for(int j = 2; j*j<=num;j++){
                if(num%j == 0){
                    flag =false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(num);
            }
        }
    }
}
