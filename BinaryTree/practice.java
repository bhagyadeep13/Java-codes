package BinaryTree;

public class practice 
{
    static class Node{
        int data;
        Node left;
        Node root;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static int diameter(Node root)
    {
        if(root==null) return 0;
        int n = level(root.left) + level(root.right);
        int left = diameter(root.left);
        int right = diameter(root.right);
        return Math.max(n,Math.max(left,right));
    }
    public static void display(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }
    public static int sum(Node root)
    {
        if(root==null) return 0;
        return sum(root.left)+sum(root.right)+root.data;
    }
    public static int max(Node root)
    {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }
    public static int min(Node root)
    {
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(min(root.left),min(root.right)));
    }
    public static int numOfNodes(Node root)
    {
        if(root==null) return 0;
        return 1+numOfNodes(root.left)+numOfNodes(root.right);
    }
    public static int level(Node root)
    {
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void invert(Node root)
    {
        if(root==null) return;
        Node n = root.left;
        root.left = root.right;
        root.right = n;
        invert(root.left);
        invert(root.right);
    }
    static boolean exists(Node root,Node p)    // NODE EXISTS IN THE TREE
        {
            if(root==p) return true;
            if(root==null) return false;
            return exists(root.left, p) || exists(root.right, p);
        }

        static Node lca(Node root,Node p,Node q)  // LOWEST COMMON ANCESTORS
        {
           if(root==null) return null;
           if(root==p||root==q) return root;
           boolean pLieLST=exists(root.left, p);
           boolean qLieLST=exists(root.left, q);
           if(pLieLST && qLieLST) return lca(root.left, p, q);
           if(pLieLST==false && qLieLST==false) return lca(root.right, p, q);
           else return root;
        }
        
    public static boolean same(Node p,Node q)
    {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data!=q.data) return false;
        return same(p.left,q.left) && same(p.right,q.right);
    }
    public static boolean symmetric(Node root)
    {
        if(root==null) return true;
        invert(root.right);
        return same(root.left,root.right);
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

        display(a);
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(numOfNodes(a));
        System.out.println(level(a));
        invert(a);
        display(a);
        System.out.println();
        System.out.println(same(a,a));
        System.out.println(symmetric(a));
        System.out.println(diameter(a));
        System.out.println(lca(a,d,e).data);
    }
}
