package BinaryTree;
import java.util.*;
public class Traversals
{
static class Node
{
   Node root;
   Node left;
   Node right;
   int data;
   Node(int data)
   {
    this.data=data;
   }
}
     static int level(Node root)
     {
          if(root==null) return 0;

          return 1+Math.max(level(root.left),level(root.right));
     }

     public static void preorderiterative(Node root)   // PREORDER ITERATIVE
    {
        Stack<Node> st=new Stack<>();
        if(root!=null) st.add(root);
        while(st.size()>0)
        {
            Node node = st.pop();
            System.out.print(node.data+" ");
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);
        }
    }

    public static void postorderiterative(Node root)   // POSTORDER ITERATIVE
    {
        Stack<Node> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        if(root!=null) st.add(root);
        while(st.size()>0)
        {
            Node node = st.pop();
            st1.push(node.data);
            if(node.left!=null) st.push(node.left);
            if(node.right!=null) st.push(node.right);
        }
        while(st1.size()>0)
        {
            System.out.print(st1.pop()+" ");
        }
    }

   static void preorder(Node root)         // PREORDER TRAVERSAL
   {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
   }
   static void Inorderitertive(Node root)       //  INORDER ITERATIVE USING STACKS
   {
     Stack<Node> st=new Stack<>();
     Node temp=root;
     while(true)
     {
          if(temp!=null)
          {
               st.push(temp);
               temp=temp.left;
          }
          else
          {
               if(st.size()==0)
               break;
               Node a=st.pop();
               System.out.print(a.data+" ");
               temp=a.right;
          }
     }
   }
   static void Inorder(Node root)           // INORDER TRAVERSAL
   {
        if(root==null)
        return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
   }
   static void  Postorder(Node root)           // POSTORDER TRAVERSAL
   {
        if(root==null)
        return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
   }
   static void reveseInorder(Node root)
   {
     if(root==null) return;
     reveseInorder(root.right);
     System.out.print(root.data+" ");
     reveseInorder(root.left);
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
    /*Node h=new Node(8);
    Node i=new Node(9);*/

    a.left=b; a.right=c;
    b.left=d; b.right=e;
    c.left=f; c.right=g;
    /*e.left=h;
    f.right=i;*/

    preorder(a);
    System.out.println();

    Inorder(a);
    System.out.println();

    Postorder(a);
    System.out.println();

    postorderiterative(a);
    System.out.println();

    Inorderitertive(a);
    System.out.println();

    preorderiterative(a);
    System.out.println();

    reveseInorder(a);
    System.out.println();

   }
}
