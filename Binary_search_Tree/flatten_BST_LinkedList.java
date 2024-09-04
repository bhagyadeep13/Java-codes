package Binary_search_Tree;

public class flatten_BST_LinkedList 
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
        static void inorder(Node root)
        {
            if(root==null) return;
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        static void flatten(Node root)   // RECURSIVE CODE FLATTENING THE BST 
        {
            if(root==null) return;
            Node left=root.left;
            Node right=root.right;
            flatten(root.left);
            flatten(root.right);
            root.left=null;
            root.right=left;
            Node temp=root;
            while(temp.right!=null)
            {
                temp=temp.right;
            }
            temp.right=right;
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

        display(a);  // PREORDER
        flatten(a);
        System.out.println();
        inorder(a);    // FLATTEND LINKED LIST

    }
}
