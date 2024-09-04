package Binary_search_Tree;
import java.util.*;
public class Delete_Node 
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
        static Node iop(Node root)
        {
            if(root==null) return null;
            Node p=root.left;
            while(p.right!=null)
            {
                p=p.right;
            }
            return p;
        } 
        static Node parent(Node root,Node pred)   // PRED PARENT FUNCTION
        {
            if(root.left==pred || root.right==pred) return root;
            Node pp=root.left;
            while(pp.right!=pred)
            {
                pp=pp.right;
            }
            return pp;
        }
        static Node delete(Node root,int key)  //  DELETION FUNCTION
        {
            if(root==null) return null;
            if(root.data==key)
            {
                // CASE 1
                if(root.left==null && root.right==null)
                {
                    return null;
                }

                // CASE 2
                else
                if(root.left==null || root.right==null)
                {
                    if(root.left==null)
                    return root.right;
                    else
                    return root.left;
                }

                // CASE 3
                else
                {
                    Node pred=iop(root);
                    Node predParent=parent(root,pred);
                    if(predParent==root)
                    {
                        pred.right=root.right;
                        return pred;
                    }
                    predParent.right=pred.left;
                    pred.right=root.right;
                    pred.left=root.left;
                    return pred;
                }
            }
            else
            if(root.data<key)
            {
                root.right=delete(root.right, key);
            }
            else
            {
                root.left=delete(root.left, key);
            }
            return root;
        }
    public static void main(String[] args) 
    {
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

        display(a);
        System.out.println();
        display(delete(a, 5));
        

        
    }
}
