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
    
   public static boolean isSameTree(Node root1, Node root2){
       if(root1 == null && root2 == null){
           return true;
       }
       
       if(root1 == null || root2 == null){
           return false;
       }
       
       boolean cond1 = root1.data == root2.data;
       boolean cond2 = isSameTree(root1.left, root2.left);
       boolean cond3 = isSameTree(root1.right,root2.right);
       
       return cond1 && cond2 && cond3;
       
//        if(cond1 == true && cond2 == true && cond3 == true){
//            return true;
//        }
       
//        return false; 
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
      
      int m = Integer.parseInt(br.readLine());
    Integer[] arr1 = new Integer[m];
    String[] values1 = br.readLine().split(" ");
    for (int i = 0; i < m; i++) {
      if (values1[i].equals("n") == false) {
        arr1[i] = Integer.parseInt(values1[i]);
      } else {
        arr1[i] = null;
      }
    }

      Node root1 = construct(arr);
      Node root2 = construct(arr1);
      
      System.out.println(isSameTree(root1, root2));
  }

}
