package BinaryTree;
import java.util.*;
public class a 
{
    public static class Node
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

    public static void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static int sum(Node root)
    {
        if(root==null) return 0;
        return root.data+sum(root.left) + sum(root.right);
    }
    public static int maxi(Node root)
    {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maxi(root.left),maxi(root.right)));
    }
    public static int mini(Node root)
    {
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(mini(root.left),mini(root.right)));
    }
    public static void invert(Node root)
    {
        if(root==null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    public static boolean same(Node p,Node q)
    {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data!=q.data) return false;
        return same(p.left,q.left) && same(p.right, q.right);
    }
    public static boolean symmetric(Node root)
    {
        if(root==null) return true;
        invert(root.left);
        return same(root.left,root.right);
    }
    public static void preorder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static int size(Node root)
    {
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int level(Node root)
    {
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
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

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        System.out.println(sum(a));

        System.out.println(maxi(a));
        System.out.println(mini(a));
        System.out.println(size(a));
        System.out.println(level(a));
        invert(a);
        preorder(a);
        System.out.println(same(a,b));

    }
}
