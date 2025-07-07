package BinaryTree;

import java.util.Stack;

public class traversal_practice 
{
  static class Node 
  {
    Node root;
    Node left;
    Node right;
    int data;
    Node(int data)
    {
      this.data = data;
    }
}

public static void postorderiterative(Node root)
{
    if(root==null) return;
    Stack<Node> st =new Stack<>();
    Stack<Node> st1 =new Stack<>();
    st.push(root);
    while(st.size()>0)
    {
        Node n = st.pop();
        st1.push(n);
        if(n.left!=null) st.push(n.left);
        if(n.right!=null) st.push(n.right);
    }
    while(st1.size()>0)
    {
        System.out.print(st1.pop().data+" ");
    }
}
public static void postorder(Node root)
{
      Node temp = root;
      if(temp==null) return;
      postorder(temp.left);
      postorder(temp.right);
    System.out.print(temp.data+" ");
}
public static void inorder(Node root)
{
    if(root==null) return;
    Node temp = root;
    Stack<Node> st=new Stack<>();
    while(true)
    {
        if(temp!=null)
        {
            st.push(temp);
            temp=temp.left;
        }
        else
        {
            if(st.size()==0) break;
            Node n = st.pop();
            System.out.print(n.data+" ");
            temp = n.right;
        }
    }
  }
    public static void inorderSimple(Node root)
    {
      if(root==null) return;
      Node temp = root; 
      inorderSimple(root.left);
      System.out.print(root.data+" ");
      inorderSimple(root.right);
    }
 
public static void main(String[] args) 
{
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        System.out.println();
        postorderiterative(a);
        System.out.println();
        inorder(a);
        System.out.println();
        inorderSimple(a);
    }
  }