package Binary_search_Tree;
import java.util.*;
public class search_In_BST 
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

        static boolean search(Node root,int v)      // SEARCH IN BST -- O(log(n))
        {
            if(root==null) return false;
            if(root.data==v) return true;
            if(v<root.data)
            {
                return search(root.left, v);
            }
            else
            {
                return search(root.right, v);
            }
        }

    public static void main(String[] args) 
    {
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

            System.out.println(search(a,15));
    }
}
