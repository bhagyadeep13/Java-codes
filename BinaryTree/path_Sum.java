package BinaryTree;
import java.util.*;
public class path_Sum 
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

        static List<Integer> copy(List<Integer> al)     // ARRAY DEEP COPY
        {
            List<Integer> al1=new ArrayList<>();
            al1.addAll(al);
            return al1;
        }
        static boolean pathsumI(Node root,int target)           // PATH SUM I
        {
            if(root==null) return true;
            if(root.left==null&&root.right==null)
            {
                target=target-root.data;
                if(target==0)
                return true;
                else
                return false;
            }
            boolean l=pathsumI(root.left, target-root.data);
            boolean r=pathsumI(root.right, target-root.data);
            if(l||r)
            return true;
            else
            return false;
        }
           
         // PATH SUM II (IMPORTANT)
static void pathsumII(Node root,List<List<Integer>> all,List<Integer> al,int target)
    {
        if(root==null) return;
        if(root.left==null&&root.right==null)
        {
            if(root.data==target)
            {
            al.add(root.data);
            all.add(al);
            }
            return;
        }
        al.add(root.data);
        List<Integer> al1=copy(al);
        List<Integer> al2=copy(al);
        if(root.left!=null) pathsumII(root.left, all, al1, target-root.data);
        if(root.right!=null) pathsumII(root.right, all, al2, target-root.data);
    }

        static int pathsumIII(Node root,int target)     // PATH SUM III
        {
            if(root==null) return 0;
            int count=0;
            if(root.data==target)   // PATH ENDS AT ANY NODES
            count++;
            count=count+pathsumIII(root.left, target-root.data)+pathsumIII(root.right, target-root.data);
            return count;
        }

        static int pathsumIII_Main(Node root,int target)    // PATH SUM MAIN FIUNCTION
        {
            if(root==null) return 0;
            int main=pathsumIII(root, target);
            int l=pathsumIII_Main(root.left, target);
            int r=pathsumIII_Main(root.right, target);
            return main+l+r;
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

    // ( PATH SUM II )
    System.out.println(pathsumI(a, 90));

    // ( PATH SUM II )
    List<List<Integer>> all=new ArrayList<>();
    List<Integer> al=new ArrayList<>();
    pathsumII(a, all, al, 8);
    System.out.println(all);

    // ( PATH SUM II )
    System.out.println(pathsumIII_Main(a,4));      
    

        }
}
