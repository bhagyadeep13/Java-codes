package Binary_search_Tree;
public class LCA_OF_BST 
{
    static class Node
    {
       Node root;
       Node left;
       Node right;
       int val;
       Node(int val)
       {
        this.val=val;
       }
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q) // T.C -- O(N)
    {
        if(root==null) return null;
        if(p==null && q==null) return null;
        if(p==null || q==null) return null;
        if(p.val<root.val && q.val<root.val) 
        {
            return lowestCommonAncestor(root.left,p,q);
        }
        else
        if(p.val>root.val && q.val>root.val)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
        else return root;
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

        System.out.println(lowestCommonAncestor(a, b, d).val);

    }
}
