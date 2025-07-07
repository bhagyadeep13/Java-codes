package BinaryTree;

import java.util.List;

// A perfect binary tree is a tree where all leaves are on the same level, and every parent has two children.
public class perfectBinaryTree 
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static int level(Node root)
    {
        if(root==null) return 0;
        int left = level(root.left);
        int right = level(root.right);
        return 1+Math.max(left,right);
    }
    public static int size(Node root)
    {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static void helper(Node root,List<Integer> al)
    {
        if(root==null) return;
        if(isPerfectHelper(root)) al.add(size(root));
        if(root.left!=null) helper(root.left,al);
        if(root.right!=null) helper(root.right,al);
    }
    private static boolean isPerfectHelper(Node root) 
    {
        if (root == null) return true;
        if(level(root.left)!=level(root.right)) return false;
        return isPerfectHelper(root.left) && isPerfectHelper(root.right);
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

    System.out.println(isPerfectHelper(a));
    }
}
