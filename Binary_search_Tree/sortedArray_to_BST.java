package Binary_search_Tree;
import java.util.*;
public class sortedArray_to_BST 
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

        static Node sortedtoBST(int[] nums,int l,int h)
        {
            if(l>h) return null;
            int mid=l+(h-l)/2;
            Node root=new Node(nums[mid]);
            root.left=sortedtoBST(nums, l, mid-1);
            root.right=sortedtoBST(nums,mid+1, h);
            return root;
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
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        display(a);
        System.out.println();
        int[] nums={2,5,9,10,13,15,19};
        Node root=sortedtoBST(nums, 0, nums.length-1);
        display(root);

        }
}
