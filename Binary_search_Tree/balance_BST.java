package Binary_search_Tree;
import java.util.*;
public class balance_BST 
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

        static void inorder(Node root,List<Integer> al)
        {
            if(root==null) return;
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
        }

        static Node balanced(List<Integer> al,int l,int h)
        {
            if(l>h)
            return null;
            int mid=l+(h-l)/2;
            Node root=new Node(al.get(mid));
            root.left=balanced(al, l, mid-1);
            root.right=balanced(al, mid+1, h);
            return root;
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

        display(a);
        System.out.println();
        List<Integer> al=new ArrayList<>();
        inorder(a, al);
        display(balanced(al, 0, al.size()-1));


        }
}
