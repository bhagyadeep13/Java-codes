package BinaryTree;
public class balanced_Binary_tree {
    
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
    static boolean ans;
    public static int level(Node root)
    {
        if(root==null) return 0;
        int left=level(root.left);
        int right=level(root.right);
        if(Math.abs(left-right)>1)
        ans=false;
        return 1+Math.max(left,right);
    }
    public static boolean balanced(Node root)
    {
        if(root==null)
        return true;
        level(root);
        return ans;

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
    /*Node h=new Node(8);
    Node i=new Node(9);*/

    a.left=b; a.right=c;
    b.left=d;  b.right=e;
    c.left=f; c.right=g;

    ans=true;
    System.out.println(balanced(a));
    
    }

}
