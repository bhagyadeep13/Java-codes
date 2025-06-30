package BinaryTree;

public class New2 
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
  public static int numofNode(Node root)
  {
      if(root==null) return 0;
      return 1+numofNode(root.left)+numofNode(root.right);
  }
  public static int level(Node root)
  {
      if(root==null) return 0;
      return 1+Math.max(level(root.left),level(root.right));
  }
  public static int sum(Node root)
  {
      if(root==null) return 0;
      return root.data+sum(root.left)+sum(root.right);
  }
  public static int max(Node root)
  {
      if(root==null) return Integer.MIN_VALUE;
      return Math.max(root.data,Math.max(max(root.left),max(root.right)));
  }
  public static int min(Node root)
  {
      if(root==null) return Integer.MAX_VALUE;
      return Math.min(root.data,Math.min(min(root.left),min(root.right)));
  }
  public static void invert(Node root)
  {
    if(root==null) return;
    Node temp = root.left;
    root.left = root.right;
    root.right = temp;
    invert(root.left);
    invert(root.right);
  }
  public static boolean same(Node a,Node b)
  {
    if(a==null && b==null) return true;
    if(a==null || b==null) return false;
    if(a.data!=b.data) return false;
    return same(a.left,b.left) || same(a.right,b.right);
  }
  public static boolean symmetric(Node root)
  {
      if(root==null) return true;
      invert(root.right);
      return same(root.left,root.right);
  }
  public static int diameter(Node root)
  {
    if(root==null) return 0;
    int a = level(root.left) + level(root.right);
    int left = diameter(root.left);
    int right = diameter(root.right);
    return Math.max(a,left+right);
  }

  public static void preorder(Node root)
  {
      Node temp = root;
      if(temp==null) return;
      System.out.print(temp.data+" ");
      preorder(temp.left);
      preorder(temp.right);
  }
  public static void inorder(Node root)
  {
      Node temp = root;
      if(root==null) return;
      inorder(root.left);
      System.out.print(root.data+" ");
      inorder(root.right);
  }
  public static void postorder(Node root)
  {
      Node temp = root;
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
        Node g=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        System.out.println(numofNode(a));
        System.out.println(level(a));
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(min(a));
        //invert(a);
        preorder(a);
        System.out.println(same(a, a));
        System.out.println(symmetric(a));
        System.out.println(diameter(a));
        
    }
}
