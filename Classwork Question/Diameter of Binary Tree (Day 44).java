import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
    
//     public static int height(Node root){
//         if(root == null) return -1;
        
//         int lh = height(root.left);
//         int rh = height(root.right);
        
//         return Math.max(lh,rh)+1;
//     }
    
//    public static int diameter01(Node root){
//         if(root == null){
//             return 0;
//         }
       
//        int ld = diameter(root.left);
//        int rd = diameter(root.right);
       
//        int h1 = height(root.left);
//        int h2 = height(root.right);
       
//        int myDiameter = h1+h2+2;
       
       
//        return Math.max(Math.max(ld,rd),myDiameter);
//    }
    public static int [] helper(Node root){
        if(root == null){
            return new int []{0,-1};
        }
        
        int [] ld = helper(root.left);
        int [] rd = helper(root.right);
        
        int [] myAns = new int[2];
        
        myAns[0] = Math.max(ld[0],Math.max(rd[0],(ld[1]+rd[1]+2)));
        myAns[1] = Math.max(ld[1],rd[1])+1;
        
        return myAns;
        
    }
    
    public static int diamter02(Node root){
        int arr[] = helper(root);
        // 0 - diameter, 1-> height
        return arr[0];
    }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

      Node root = construct(arr);
      System.out.println(diamter02(root));
  }

}
