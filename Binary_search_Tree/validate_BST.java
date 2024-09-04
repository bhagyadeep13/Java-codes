package Binary_search_Tree;
import java.util.*;
public class validate_BST 
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
        static void inorder(Node root,List<Integer> al)
        {
            if(root==null)
            return;
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
        } 

        static boolean flag=true;

        static long max(Node root)
        {
            if(root==null)
            return Long.MIN_VALUE;
            long a=max(root.left);
            if(a>=root.data)
            flag=false;
            long b=max(root.right);
            return Math.max(root.data,Math.max(a,b));

        }

        static long min(Node root)
        {
            if(root==null)
            return Long.MAX_VALUE;
            long a=min(root.left);
            long b=min(root.right);
            if(b<=root.data)
            flag=false;
            return Math.min(root.data,Math.min(a,b));

        }

        static boolean validBST(Node root)      // METHOD--1 [TC--O(N)]
        {
            if(root==null) return true;
            flag=true;
            max(root);
            min(root);
            return flag;
        }


        static boolean validBST2(Node root)  //    METHOD--2 [TC--O(N)]
        {
            if(root==null) return true;
            List<Integer> al=new ArrayList<>();
            inorder(root, al);
            System.out.println(al);
            for(int i=1;i<al.size();i++)
            {
                if(al.get(i-1)>=al.get(i))
                return false;
            }
            return true;

        }
    public static void main(String[] args) {

            Node a=new Node(10);
            Node b=new Node(5);
            Node c=new Node(15);
            Node d=new Node(2);
            Node e=new Node(13);
            Node f=new Node(9);
            Node g=new Node(19);

            a.left=b; a.right=c;
            b.left=d; b.right=e;
            c.left=f; c.right=g;

            System.out.println(validBST2(a));
    }
}
