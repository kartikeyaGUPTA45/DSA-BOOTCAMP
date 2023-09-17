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
    
    public static Node helper(int [] post,int psi, int pei,int [] in, int isi,int iei){
        if(isi>iei){
            return null;
        }
        Node node = new Node(post[pei]);
        
        int idx = isi;
        
        while(in[idx] != post[pei]){
            idx++;
        }
        
        int tnn = idx-isi;
        
        node.left = helper(post,psi,psi+tnn-1,in,isi,idx-1);
        node.right = helper(post,psi+tnn, pei-1, in,idx+1,iei);
        
        return node;
        
    }
  
    public static Node constructTree(int [] post, int [] in){
        return helper(post,0,post.length-1, in, 0,in.length-1);
    }

  public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int in[] = new int [n];
      for(int i=0;i<n;i++){
          in[i] = scn.nextInt();
      }
      
      int post[] = new int [n];
      for(int i=0;i<n;i++){
          post[i] = scn.nextInt();
      }
  
      Node root = constructTree(post,in);
      levelOrderTraversal(root);
  }

}
