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
    
  public static void preOrder(Node node){
      if(node == null) {
          return;
      }
      
      Stack<Node> st = new Stack<>();
      st.push(node);
      
      while(st.size() > 0){
          Node temp = st.pop();
          
          System.out.print(temp.data + " ");
          
          if(temp.right != null){
              st.push(temp.right);
          }
          
          if(temp.left != null){
              st.push(temp.left);
          }
      }
  }
    
  public static void inOrder(Node node){
      Stack<Node> st = new Stack<>();
      Node temp = node;
      
      while(true){
          if(temp != null){
              st.push(temp);
              temp = temp.left;
          } else {
              if(st.size() == 0){
                  break;
              }
              
              temp = st.pop();
              System.out.print(temp.data + " ");
              temp = temp.right;
          }
      }
  }
    
  public static void postOrder(Node node){
      if(node == null) {
          return;
      }
      
      Stack<Node> st1 = new Stack<>();
      Stack<Node> st2 = new Stack<>();
      
      st1.push(node);
      
      
      while(st1.size() > 0){
          node = st1.pop();
          st2.push(node);
          
          if(node.left != null){
              st1.push(node.left);
          }
          
          if(node.right != null){
              st1.push(node.right);
          }
      }
      
      
      while(st2.size() > 0){
          System.out.print(st2.pop().data + " ");
      }
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
      preOrder(root);
      System.out.println();
      inOrder(root);
      System.out.println();
      postOrder(root);
  }

}
