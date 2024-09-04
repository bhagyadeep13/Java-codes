package BinaryTree;
public class DiameterOfTree 
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
    static int diameter;
    static int level(Node root)      // NUMBER OF LEVELS IN TREE
    {
         if(root==null)
         return 0;
         int left=level(root.left);     // DIAMETER -- O(N) APPROACH
         int right=level(root.right);
         if(left+right>diameter)
         diameter=left+right;
         return  1 + Math.max(left,right);
    }

    static int diameter(Node root)      // DIAMETER OF THE TREE
    {
        if(root==null)
        return 0;
        int d = level(root.left) + level(root.right);
        int lst = diameter(root.left);
        int rst = diameter(root.right);
        return Math.max(d,Math.max(lst,rst));
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
    c.right=g; c.left=f;
    System.out.println(diameter(a));
    diameter=0;
    level(a);                   // DIAMETER -- O(N) APPROACH
    System.out.println(diameter);
    }
}
