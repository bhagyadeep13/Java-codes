package BinaryTree;
import java.util.*;
public class Right_side_view 
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
    public static int level(Node root)
    {
        if(root==null) return 0;
        
        return 1+Math.max(level(root.left),level(root.right));
    }

    static void leftside(Node root,int n,int level,List<Integer> al)// LEFT SIDE VIEW
    {
        if(root==null)
        return;
        if(level>n)
        return;
        if(level==n)
        {
            al.set(level,root.data);
        }
        if(root.right!=null) rightSide(root.right, n, level+1, al);
        if(root.left!=null) rightSide(root.left, n, level+1, al);
    }

    static void rightSide(Node root,int n,int level,List<Integer> al) //RIGHT SIDE VIEW
    {
        if(root==null)
        return;
        if(level>n)
        return;
        if(level==n)
        {
            al.set(level,root.data);
        }
        if(root.right!=null) rightSide(root.right, n, level+1, al);
        if(root.left!=null) rightSide(root.left, n, level+1, al);
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

        List<Integer> al=new ArrayList<>();
        for(int i=0;i<level(a);i++)
        {
            al.add(0);
        }
        for(int i=0;i<level(a);i++)
        {
            leftside(a, i, 0, al);        }
        System.out.println(al);
    }
}
