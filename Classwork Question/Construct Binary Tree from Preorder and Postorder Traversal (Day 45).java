import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() > 0){
            int sz = q.size();
            for(int i=0;i<sz;i++){
                Node temp = q.remove();
                System.out.print(temp.data + " ");
                
                if(temp.left != null){
                    q.add(temp.left);
                }
                
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
    }
    
    public static Node helper(int [] post,int posi, int poei,int [] pre, int psi,int pei){
       if(psi>pei){
           return null;
       }
        
        Node node = new Node(pre[psi]);
        
        if(psi == pei){
            return node;
        }
        
        int idx = posi;
        while(post[idx] != pre[psi+1]){
            idx++;
        }
        
        int tnn = idx-posi+1;
        
        node.left = helper(post,posi,idx,pre,psi+1,psi+tnn);
        node.right = helper(post,idx+1,poei-1,pre,psi+tnn+1,pei);
        
        return node;
        
    }
  
    public static Node constructTree(int [] post, int [] pre){
        return helper(post,0,post.length-1, pre, 0,pre.length-1);
    }

  public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int pre[] = new int [n];
      for(int i=0;i<n;i++){
          pre[i] = scn.nextInt();
      }
      
      int post[] = new int [n];
      for(int i=0;i<n;i++){
          post[i] = scn.nextInt();
      }
  
      Node root = constructTree(post,pre);
      levelOrderTraversal(root);
  }

}
