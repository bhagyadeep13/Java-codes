package BinaryTree;
import java.util.*;
public class a 
{
    public static int diameter;
    public static class Node
    {
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
        int left=level(root.left);
        int right=level(root.right);
        if(left+right>diameter)
        diameter=left+right;
        return 1+Math.max(left,right);
    }

    public static int size(Node root)
    {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }

    public static int sum(Node root)
    {
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }

    public static int max(Node root)
    {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }

    public static int min(Node root)
    {
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(max(root.left),max(root.right)));
    }

    public static void preorder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root)
    {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void invert(Node root)
    {
        if(root==null) return;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
    }

    public static boolean same(Node root1,Node root2)
    {
        if(root1==null && root2==null) return true;
        if(root1!=null && root2==null || root1!=null && root2==null) return false;
        if(root1.data!=root2.data) return false;
        return same(root1.right,root2.right) || same(root1.left,root2.left);
    }

    public static boolean symmetric(Node root)
    {
        if(root.right!=null) invert(root.right);
        if(same(root.left,root.right)) return true;
        else return false;
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

        System.out.println(level(a));
        System.out.println(level(a)-1);
        System.out.println(size(a));
        System.out.println(size(a)-1);
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(min(a));
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        invert(a);
        System.out.println();
        preorder(a);
        System.out.println();
        System.out.println(same(a, b));
        System.out.println(symmetric(d));
        System.out.println(diameter);

        
    }
}
