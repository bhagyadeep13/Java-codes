package Binary_search_Tree;

public class a 
{
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data)
        {
            this.data=data;
        }
    }
    static void preoorder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        preoorder(root.left);
        preoorder(root.right);
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

        preoorder(a);
    }
}
