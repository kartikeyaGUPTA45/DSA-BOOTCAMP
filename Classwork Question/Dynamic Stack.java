import java.io.*;
import java.util.*;

class CustomStack{
    
    int capacity = -1;
    int size = 0;
    ArrayList<Integer> stk = new ArrayList<>();
    
    CustomStack(int n){
        capacity = n;
    }
    
    void push(int data){
        
        if(size == capacity){
            capacity += capacity;
        }
        
        stk.add(data);
        size++;
    }
    
    void pop(){
        
        if(size == 0){
            System.out.println("Stack underflow");
            return;
        }
        
        int data = stk.remove(size-1);
        System.out.println(data);
        size--;
    }
    
    void display(){
        
        for(int i=size-1; i>=0; i--){
            System.out.print(stk.get(i) + " ");
        }
        
        System.out.println();
    }
    
    void top(){
        if(size == 0){
            System.out.println("Stack underflow");
            return;
        }
        
        System.out.println(stk.get(size-1));
    }
}
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CustomStack cst = new CustomStack(n);
        
        String s = "";
        
        while(sc.hasNext()){
            s = sc.next();
            
            if(s.equals("push") == true){
                int data = sc.nextInt();
                cst.push(data);
            }
            
            else if(s.equals("pop") == true){
                cst.pop();
            }
            
            else if(s.equals("display") == true){
                cst.display();
            }
            
            else if(s.equals("top") == true){
                cst.top();
            }
            
            else
                break;
        }
        
    }
}
