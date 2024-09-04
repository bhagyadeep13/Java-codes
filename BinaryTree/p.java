package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class p 
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
        static void preiterative(Node root)
        {
            Stack<Node> st=new Stack<>();
            if(root!=null) st.push(root);
            while(st.size()>0)
            {
                Node a=st.pop();
                System.out.print(a.data+" ");
                if(a.left!=null) preiterative(a.left);
                if(a.right!=null) preiterative(a.right);
            }
        }
        static void inorder(Node root)
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
        static int leveloftree(Node root)
        {
            if(root==null) return 0;
            return 1+Math.max(leveloftree(root.left),leveloftree(root.right));
        }
        static void level(Node root)
        {
            Queue<Node> q=new ArrayDeque<>();
            if(root!=null) q.add(root);
            while(q.size()>0)
            {
                Node a=q.remove();
                System.out.print(a.data+" ");
                if(a.left!=null) q.add(a.left);
                if(a.right!=null) q.add(a.right);
            }
        }
        static void level2(Node root,int level,int n)
        {
            if(root==null)
            return;
            if(level==n)
            {
            System.out.print(root.data+" ");
            }
            if(root.left!=null) level2(root.left, level+1, n);
            if(root.right!=null) level2(root.right, level+1, n);
            
        }
        static boolean isexists(Node root,Node p)
        {
            if(root==p) return true;
            if(root==null) return false;
            return isexists(root.left, p) || isexists(root.right, p);
        }
        static Node lowest(Node root,Node p,Node q)
        {
            if(root==p && root==q) return root;
            if(root==p || root==q) return root;
            boolean l=isexists(root.left, p);
            boolean r=isexists(root.left, q);
            if(l && r) return lowest(root.left, p, q);
            if(!l && !r) return lowest(root.right, p, q);
            else return root;

        }
        public static void main(String[] args) {
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

    preiterative(a);
    System.out.println();
    
    inorder(a);
    System.out.println();

    level(a);
    System.out.println();

    for(int i=0;i<leveloftree(a);i++)
    {
     level2(a,0,i);
    System.out.println();
    }

    System.out.println(lowest(a, g, f).data);

        }
}
