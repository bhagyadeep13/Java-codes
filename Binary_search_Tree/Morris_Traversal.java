package Binary_search_Tree;
import java.util.*;
public class Morris_Traversal 
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
        static int level(int level,int n,Node root,int sum)
        {
            if(root==null || level>n) 
            {
            return sum;
            }
            if(level==n)
            sum=sum+root.data;
            return level(level,n,root.left,sum)+level(level,n,root.right,sum);
        }

        

        static void morris(Node root,List<Integer> al)   // MORRIS(INORDER TRAVERSAL)
        { 
            if(root==null) return;
            Node curr=root;
            while(curr!=null)
            {
                if(curr.left!=null)
                {
                    Node pred=curr.left;
                    while(pred.right!=null && pred.right!=curr)
                    {
                        pred=pred.right;
                    }
                    if(pred.right==null)
                    {
                        pred.right=curr;
                        curr=curr.left;
                    }
                    else
                    {
                        al.add(curr.data);
                        curr=curr.right;
                        pred.right=null;
                    }
                }
                else
                {
                    al.add(curr.data);
                    curr=curr.right;
                }
            }
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
        b.left=d; b.right=f;
        c.left=e; c.right=g;

        List<Integer> al=new ArrayList<>();
        morris(a, al);
        System.out.println(al);

        }
}
