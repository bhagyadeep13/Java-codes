package BinaryTree;
import java.util.*;

import Recursion.sum;
public class s 
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
    public static int sum(Node root)
    {
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
    public static int min(Node root)
    {
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(min(root.left),min(root.right)));
    }
    public static int max(Node root)
    {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }
    public static void display(Node root)
    {
        if(root==null) return;
        display(root.left);
        display(root.right);
        System.out.print(root.data+" ");
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

        display(a);
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(sum(a));
    }
}
