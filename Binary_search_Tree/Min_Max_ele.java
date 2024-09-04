package Binary_search_Tree;
import java.util.*;

public class Min_Max_ele 
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
        static int max(Node root)
        {
            if(root.left==null && root.right==null)
            return root.data;
            return max(root.right);
        }
        static int min(Node root)
        {
            if(root.left==null && root.right==null)
            return root.data;
            return min(root.left);
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

            System.out.println(max(a));
            System.out.println(min(a));
        }
}
