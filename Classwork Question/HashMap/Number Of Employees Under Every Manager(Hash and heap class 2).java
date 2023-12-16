import java.io.*;
import java.util.*;

public class Solution {
    public static void countNoOfEmployess(HashMap<String,String> input, int n) {
        HashMap<String,HashSet<String>> tree = new HashMap<>();
        String ceo = "";
        
        for(String emp : input.keySet()) {
            String man = input.get(emp);
            
            if (emp.equals(man)) {
                ceo = emp;
            } else {
                if(tree.containsKey(man)) {
                    HashSet<String> emps = tree.get(man);
                    emps.add(emp);
                } else {
                    HashSet<String> emps = new HashSet<>();
                    emps.add(emp);
                    tree.put(man,emps);
                }
            }
            
        }
        
        HashMap<String,Integer> ans = new HashMap<>();
        getSize(tree,ans, ceo);
        
        for(String man: ans.keySet()) {
            System.out.println(man + " " + ans.get(man));
        }
    }
    
    public static int getSize(HashMap<String,HashSet<String>> tree, HashMap<String,Integer> ans, String man) {
        if (tree.containsKey(man) == false) {
            ans.put(man, 0);
            return 1;
        }
        int size = 0;
        
        for(String emp:tree.get(man)) {
            int childSize = getSize(tree,ans,emp);
            size += childSize;
        }
        
        ans.put(man,size);
        return size+1;
    }

    
// A 0
// B 0
// C 3
// D 0
// E 1
// F 0
// G 6
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashMap<String,String> input = new HashMap<>();
        for(int i=0;i<n;i++) {
            String emp = scn.next();
            String man = scn.next();
            input.put(emp,man);
        }
        
        countNoOfEmployess(input,n);
    }
}
