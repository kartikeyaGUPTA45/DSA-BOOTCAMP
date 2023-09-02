import java.io.*;
import java.util.*;

public class Solution {

    public static class Stack {
        int arr [];
        int cap;
        int tos;
        
        Stack(int cap){
            this.cap = cap;
            arr = new int[cap];
            tos = -1;
        }
        
        int size(){
            return tos+1;
        }
        
        void display(){
            for(int i =tos;i>=0;i--){
                System.out.print(arr[i] + " ");
            }
        }
        
        int peek(){
            if(tos == -1){
                System.out.println("Stack underflow");
                return -1;
            }
            
            return arr[tos];
        }
        
        int pop(){
            if(tos == -1){
                System.out.println("Stack underflow");
                return -1;
            }
            
            int val = arr[tos];
            tos--;
            return val;
        }
        
        void push(int val){
            if(tos == arr.length-1){
                int newArr[] = new int[2*arr.length];
                for(int i=0;i<=tos;i++){
                    newArr[i] = arr[i];
                }
                
                arr = newArr;
            }
            
            tos++;
            arr[tos] = val;
            
        }
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int t = 15;
        Stack st = new Stack(5);
        for(int i=0;i<t;i++){
            String operation = scn.next();
            if (operation.equals("Push")){
                int x = scn.nextInt();
                st.push(x);
            } else if (operation.equals("Pop")){
                System.out.println(st.pop());
            } else if (operation.equals("Size")){
                System.out.println(st.size());
            } else if (operation.equals("Display")){
                st.display();
            } else if (operation.equals("Peek")){
                System.out.println(st.peek());
            } else {
                System.out.println("Performing wrong opertaion");
            }
        }
    }
}
