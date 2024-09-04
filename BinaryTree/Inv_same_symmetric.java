package BinaryTree;

import Recursion.sum;

public class Inv_same_symmetric 
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
    static void display(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }
    static boolean symmetric(Node root)     // SYMMETRIC TREE
    {
        if(root==null)  return true;
        invert(root.left);
        if(!same(root.left,root.right))  return false;
        return true;
    }
    static boolean same(Node p,Node q)      // SAME TREE    
    {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.data!=q.data)   return false;
        if(!same(p.left,q.left)) return false;
        if(!same(p.right,q.right)) return false;
        return true;

    }

    static void invert(Node root)       // INVERT THE BINARY TREE
    {
        if(root==null)
        {
            return;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
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
    c.right=g; c.left=f;

    display(a);
    System.out.println();
    display(a);
    System.out.println();
    System.out.println(same(a,a));
    System.out.println(symmetric(g));
    }
}
