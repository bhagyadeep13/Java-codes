package BinaryTree;

public class k 
{
    static class Node
    {
        int data;
        Node root;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static void preorder(Node root)
    {
        if(root==null) return;
        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);
    }
    public static void main(String[] args) 
    {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        preorder(a);
        
    }
}
