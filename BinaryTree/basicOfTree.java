package BinaryTree;

import java.util.*;
import java.util.Collections;

public class basicOfTree
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
   static int level(Node root)      // NUMBER OF LEVELS IN TREE
   {
        if(root==null)
        return 0;
        return  1 + Math.max(level(root.left),level(root.right));
   }

   static int min(Node root)        // MIN VALUE IN TREE
   {
    if(root==null)
    return Integer.MAX_VALUE;
    return Math.min(root.data,Math.min(min(root.left),min(root.right)));
   }

   static int max(Node root)        //  MAX VALUE IN THE TREE
   {
    if(root==null)
    return Integer.MIN_VALUE;
    return Math.max(root.data,Math.max(max(root.left),max(root.right)));
   }

   static int pro(Node root)        //PRODUCT OF ALL NODES IN THE TREE
   {
        if(root.data!=0)
        {
            return 1;
        }
        return root.data*pro(root.left)*pro(root.right);
   }

   static int sum(Node root)        // SUM OF ALL NODES IN TREE
   {
        if(root==null)
        {
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
   }

   static void display(Node root)       // PRINT ALL THE NODES OF THE TREE
   {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
   }
    public static void main(String[] args) 
    {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        /*System.out.println(b.left.data);  // print the value of d
        System.out.println(a.left.left.data);   // print the value of d

        System.out.println(c.right.data);  // print the value of f
        System.out.println(a.right.right.data);   // print the value of f*/

        /*Node g=new Node(7);
        Node h=new Node(8);
        c.left=g; e.right=h;*/

        //display(a);
        System.out.println(sum(a));
        System.out.println(pro(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(level(a));
        System.out.println(level(a)-1);   // Height = levels - 1;
    }
}

