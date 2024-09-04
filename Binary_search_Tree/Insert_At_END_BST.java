package Binary_search_Tree;
import java.util.*;
public class Insert_At_END_BST 
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
        static Node insert(Node root,int v)   // INSERT IN BST AT END
        {
            if(root==null) return new Node(v);
            if(v<root.data)
            {
                if(root.left==null)
                {
                    root.left=new Node(v);
                    return root;
                }
                else
                {
                   return insert(root.left, v);
                }
            }
            else
            {
                if(root.right==null)
                {
                    root.right=new Node(v);
                    return root;
                }
                else
                {
                   return insert(root.right, v);
                }
            }
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

        insert(a, 1);
        display(a);

    }
}
