package BinaryTree;
import java.util.*;
public class bottom_view 
{
    public static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Pair2 {
        int level1;
        Node node1;

        Pair2(int level1, Node node1) {
            this.node1 = node1;
            this.level1 = level1;
        }
    }
        public static void bottomView(Node root) // Bottom VIEW OF THE BINARY TREE
        {
            int minLevel=0;
            int maxLevel=0;
            Queue<Pair2> q=new ArrayDeque<>();
            HashMap<Integer,Node> h=new HashMap<>();
            if(root!=null) q.add(new Pair2(0, root));
            while(q.size()>0)
            {
                Pair2 p=q.remove();
                int lvl=p.level1;
                Node temp=p.node1;
                h.put(lvl,temp);  // Agar vo lvl hashmap me h toh upgrade its value
                maxLevel=Math.max(lvl,maxLevel); // Agar vo lvl hashmap me nhi h toh hashmap me daal do
                minLevel=Math.min(minLevel, lvl);
                if(temp.left!=null)  q.add(new Pair2(lvl-1, temp.left)); // uske left child me lvl-1
                if(temp.right!=null) q.add(new Pair2(lvl+1, temp.right)); // uske right child me lvl+1
            }
            for(int i=minLevel;i<=maxLevel;i++)
            {
                System.out.print(h.get(i).data+" ");
            }
        }
    
        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            Node f = new Node(6);
            Node g = new Node(7);
    
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.left = f;
            c.right = g;
    
            bottomView(a); // TOP VIEW OF THE BINARY TREE
    
    }
}
