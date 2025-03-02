package BinaryTree;
import java.util.*;;
public class c 
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
    public static int secondLargest(Node root)
    {
        if(root==null) return Integer.MIN_VALUE;
        if(root.data!=max(root))
        return Math.max(root.data,Math.max(secondLargest(root.left),secondLargest(root.right)));
        else return 0;
    }
    public static int max(Node root)        //  MAX VALUE IN THE TREE
   {
    if(root==null) return Integer.MIN_VALUE;
    return Math.max(root.data,Math.max(max(root.left),max(root.right)));
   }
    public static int levels(Node root)
    {
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
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
    public static void main(String[] args) 
    {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g= new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=g; c.left=f;

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        System.out.println(levels(a));

        System.out.println(secondLargest(a));
    }
}
