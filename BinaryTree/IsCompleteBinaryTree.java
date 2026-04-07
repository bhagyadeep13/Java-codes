package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
public class IsCompleteBinaryTree 
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
 public boolean isCompleteTree(Node root) 
    {
        if(root==null) return true;
        boolean ans = false;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0)
        {
            Node n = q.remove();
        if(n==null) ans = true; // once we see null, all following must also be null
            else
            {
                if(ans==true) return false; // a non-null after null = not complete
                q.add(n.left);
                q.add(n.right);
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
    IsCompleteBinaryTree ll = new IsCompleteBinaryTree();
    Node a=new Node(1);
    Node b=new Node(2);
    Node c=new Node(3);
    Node d=new Node(4);
    Node e=new Node(5);
    Node f=new Node(6);
    Node g=new Node(7);

    a.left=b; a.right=c;
    b.left=d; b.right=e;
    c.right=g;c.left=f;

    System.out.println(ll.isCompleteTree(a));

    }
}
