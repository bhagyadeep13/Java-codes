package Binary_search_Tree;

public class New 
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
    public static int max(Node root)  // T.C -- O(log(n))
    {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        return max(root.right);
    }
    public static int min(Node root)  // T.C -- O(log(n))
    {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        return min(root.left);
    }
    public static void main(String[] args) 
    {
        Node a=new Node(4);
        Node b=new Node(2);
        Node c=new Node(6);
        Node d=new Node(1);
        Node e=new Node(3);
        Node f=new Node(5);
        Node g=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        System.out.println(max(a));
        System.out.println(min(a));
    }
}
