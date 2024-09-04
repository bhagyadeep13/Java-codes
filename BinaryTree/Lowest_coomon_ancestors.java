package BinaryTree;
public class Lowest_coomon_ancestors 
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

        static boolean exists(Node root,Node p)    // NODE EXISTS IN THE TREE
        {
            if(root==p) return true;
            if(root==null) return false;
            return exists(root.left, p) || exists(root.right, p);
        }

        static Node Lowest(Node root,Node p,Node q)  // LOWEST COMMON ANCESTORS
        {
           if(root==p||root==q) return root;
           boolean pLieLST=exists(root.left, p);
           boolean qLieLST=exists(root.left, q);
           if(pLieLST==true && qLieLST==true)
           return Lowest(root.left, p, q);
           if(pLieLST==false && qLieLST==false)
           return Lowest(root.right, p, q);
           else return root;
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

        Node temp=Lowest(a,b,d);
        System.out.println(temp.data);
        }
}
