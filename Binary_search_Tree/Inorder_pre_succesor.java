package Binary_search_Tree;
import java.util.*;
public class Inorder_pre_succesor 
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
        static void level(Node root,int l,int n)
        {
            if(root==null) return;
            if(l==n)
            {
            System.out.print(root.data+" ");
            return;
            }
            level(root.left, l+1, n);
            level(root.right, l+1, n);
        }
        public static int le(Node root)
        {
            if(root==null) return 0;
            return 1+Math.max(le(root.left),le(root.right));
        }
        static void inorder(Node root,List<Integer> al)  //METHOD 1 BY INORDER TRAVERSAL
        {
            if(root==null) return;
            inorder(root.left, al);
            al.add(root.data);
            inorder(root.right, al);
        }

        // METHOD 2 START

        static int predecessor(Node root)  // THIS METHOD IS ONLY IF WE HAVE
        {                               // PREDECESSOR AND SECCESSOR AT THE BELOW LEVEL 
            if(root==null) return 0;    // AS COMPARE TO ROOT
            Node p=root.left;
            while(p.right!=null)
            {
                p=p.right;
            }
            return p.data;
        }
        static int successor(Node root)    // THIS METHOD IS ONLY IF WE HAVE
        {                               // PREDECESSOR AND SECCESSOR AT THE BELOW LEVEL 
            if(root==null) return 0;       // AS COMPARE TO ROOT
            Node p=root.right;
            while(p.left!=null)
            {
                p=p.left;
            }
            return p.data;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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


        /*int key=sc.nextInt();                  // INORDER PREDECESSOR AND SUCCESSOR
        List<Integer> al=new ArrayList<>();
        int pred=-1,succ=-1;
        inorder(a, al);
        System.out.println(al);
        if(key==al.get(0))
        {
            succ=al.get(1);
            System.out.println(pred);
            System.out.println(succ);
            return;
        }
        if(key==al.get(al.size()-1))
        {
            pred=al.get(al.size()-2);
            System.out.println(pred);
            System.out.println(succ);
            return;
        }
        for(int i=1;i<al.size()-1;i++)
        {
            if(al.get(i)==key)
            {
                pred=al.get(i-1);
                succ=al.get(i+1);
            }
        }
        System.out.println(pred);
        System.out.println(succ);
        System.out.println(predecessor(a));
        System.out.println(successor(a));*/

            level(a, 1, le(a));
    }
}
