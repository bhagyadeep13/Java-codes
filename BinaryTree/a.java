package BinaryTree;

import java.util.*;

public class a 
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

    public static void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
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
    public static int sum(Node root)
    {
        if(root==null) return 0;
        return sum(root.left)+sum(root.right)+root.data;
    }
    static List<String> all = new ArrayList<>();
    public static void BinaryPathString(Node root,StringBuilder s,int t)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            t=t-root.data;
            if(t==0)
            {
                all.add(s.toString());
            }
        }
        s.append(root.data);
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(s);
        BinaryPathString(root.left, s1, t-root.data);
        BinaryPathString(root.right, s2, t-root.data);
    }
    public static int max(Node root)
    {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }
    public static int min(Node root)
    {
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(min(root.left),min(root.right)));
    }
    public static int size(Node root)
    {
        if(root==null) return 0;
        return 1+size(root.left) + size(root.right);
    }
    public static int level(Node root)
    {
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
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
    public static boolean same(Node a,Node b)
    {
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.data!=b.data) return false;
        return same(a.left,b.left) && same(a.right, b.right);
    }
    public static boolean Symmetric(Node a)
    {
        if(a==null) return true;
        invert(a.right);
        return same(a.left,a.right);
    }  
    public static int diameter(Node root)
    {
        if(root==null) return 0;
        int val = level(root.left)+level(root.right);
        int left = diameter(root.left);
        int right = diameter(root.right);
        return Math.max(val,Math.max(left,right));
    }
    public static void levelOrder(Node root)
    {
        if(root==null) return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {  
            Node p = q.remove();
            System.out.print(p.data+" ");
            if(p.left!=null) q.add(p.left);
            if(p.right!=null) q.add(p.right);
        }
    }
    static List<Integer> al1;
    static int sum=0;
    public static void paths(Node root,String s)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            s = s + root.data;
            System.out.println(s);
            sum = sum + Integer.parseInt(s);
        }
        paths(root.left,s+root.data);
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

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(size(a));
        System.out.println(level(a));
        preorder(a);
        System.out.println(same(a, b));
        System.out.println(Symmetric(a));
        System.out.println(diameter(a));
        levelOrder(a);
        System.out.println();
        StringBuilder s = new StringBuilder("");
        BinaryPathString(a, s, 7);
        System.out.println(all);
        paths(a, "");
        System.out.println(sum);
    }
}
