package Binary_search_Tree;
import java.util.*;
public class kth_smallest 
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
        static void inorder(Node root,List<Integer> al)
        {
            if(root==null)
            return;
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
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
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        List<Integer> al=new ArrayList<>();   // KTH SMALLEST USING INORDER TRAVERSA;
        int k=sc.nextInt();                    // TIME COMPLEXITY -- O(N);
        inorder(a, al);
        System.out.println(al);
        System.out.println(al.get(k-1));
    }
}
