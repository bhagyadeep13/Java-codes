package BinaryTree;
import java.util.*;
public class BinaryTreePath 
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

 static void binaryPaths(Node root,String s, List<String> al)  // Binary tree paths
        {
            if(root==null) return;
            if(root.left==null&&root.right==null)
            {
                s=s+root.data;
                al.add(s);
            }
            if(root.left!=null) binaryPaths(root.left, s+root.data+"->", al);
            if(root.right!=null) binaryPaths(root.right, s+root.data+"->", al);
        }
        
        static int sum(Node root,String s,int sum)  // PATH SUM FROM ROOT TO LEAF
        {
            if(root==null) return 0;
            if(root.left==null&&root.right==null)
            {
                s=s+root.data;
                sum=sum+Integer.parseInt(s);
                return sum;
            }
    return sum(root.left, s+root.data,sum)+sum(root.right, s+root.data,sum);
        }
    public static void main(String[] args) {
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

    System.out.println(sum(a,"",0));
    
        }
}
