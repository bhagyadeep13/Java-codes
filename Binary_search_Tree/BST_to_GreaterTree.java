package Binary_search_Tree;
import java.util.*;
public class BST_to_GreaterTree 
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
        static void inorder(Node root,List<Node> al)
        {
        if(root==null) return;
        inorder(root.left, al);
        al.add(root);
        inorder(root.right, al);
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

        System.out.println();
        List<Node> al=new ArrayList<>();
        inorder(a, al);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i).data+" ");
        }
        System.out.println();
        for(int i=al.size()-2;i>=0;i--)
        {
            al.get(i).data+=al.get(i+1).data;
        }
        display(a);

    }
}
