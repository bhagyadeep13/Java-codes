package BinaryTree;
import java.util.*;
public class b 
{
    public static class Node
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

    public static void display(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }

    public static void invert(Node root)
    {
        if(root==null) return;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }

    public static boolean same(Node root1,Node root2)
    {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.data==root2.data) return true;
        return same(root1.left,root2.left) && same(root1.right,root2.right);
    }

    public static boolean symmetric(Node root)
    {
        if(root==null) return true;
        invert(root.right);
        return same(root.left,root.right);
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

        display(a);
        invert(a);
        System.out.println();
        display(a);
        System.out.println();
        System.out.println(symmetric(a));
        
    }
}
