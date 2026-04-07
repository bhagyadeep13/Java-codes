package Binary_search_Tree;

public class a1 
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
    public static int max(Node root)
    {
        if(root==null) return Integer.MIN_VALUE;
        if(root.left==null && root.right==null) return root.data;
        return max(root.right);
    }
    public static int min(Node root)
    {
        if(root==null) return Integer.MAX_VALUE;
        if(root.left==null && root.right==null) return root.data;
        return min(root.left);
    }
    public static Node predecessor(Node root)
    {
        Node a = root.left;
        while(a.right!=null)
        {
            a=a.right;
        }
        return a;
    }
    public static Node succeser(Node root)
    {
        Node a = root.right;
        while(a.left!=null)
        {
            a=a.left;
        }
        return a;
    }
    public static void Inorder(Node root)
    {
        if(root==null) return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) 
    {
        Node a=new Node(10);
        Node b=new Node(5);
        Node c=new Node(15);
        Node d=new Node(2);
        Node e=new Node(9);
        Node f=new Node(13);
        Node g=new Node(19);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        System.out.println(max(a));
        System.out.println(min(a));
        Inorder(a);
        System.out.println();
        System.out.println(predecessor(b).data);
        System.out.println(predecessor(c).data);
    }
}
