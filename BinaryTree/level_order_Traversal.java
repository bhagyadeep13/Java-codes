package BinaryTree;
import java.util.*;
public class level_order_Traversal 
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
   static class Pair{
     Node node;
     int level;
     Pair(Node node,int level)
     {
          this.node=node;
          this.level=level;
     }
    }

     static int level(Node root)         // LEVELS OF A TREE
     {
          if(root==null) return 0;

          return 1+Math.max(level(root.left),level(root.right));
     }

     static void nthlevel(Node root,int level,int n)  // LEVELORDER BY NTH LEVEL
     {
          if(root==null) return;
          if(level==n)
          {
               System.out.print(root.data+" ");
          }
          if(root.left!=null) nthlevel(root.left, level+1, n);
          if(root.right!=null) nthlevel(root.right, level+1, n);
     }

     static void levelordersimple(Node root)  //SIMPLE LEVEL ORDER TRAVERSAL USING QUEUE
     {
          Queue<Node> q=new ArrayDeque<>();
          if(root!=null) q.add(root);
          while(q.size()>0)
          {
               Node a= q.remove();
               System.out.print(a.data+" ");
               if(a.left!=null)  q.add(a.left);
               if(a.right!=null) q.add(a.right);
          }
          System.out.println();
     }
     public static void levelSimple(Node root)
     {
          if(root==null) return;
          Queue<Node> q = new ArrayDeque<>();
          q.add(root);
          while (q.size()>0) 
          {
               Node p = q.remove();
               System.out.print(p.data+" ");
               if(p.left!=null) q.add(p.left);
               if(p.right!=null) q.add(p.right);
          }
     }
     static void levelOrder(Node root)
     {
          Queue<Node> q = new ArrayDeque<>();
          if(root!=null) q.add(root);
          while(q.size()>0)
          {
               Node t = q.remove();
               System.out.print(t.data+" ");
               if(t.left!=null) q.add(t.left);
               if(t.right!=null) q.add(t.right);
          }
          System.out.println();
     }
     static void levelorder(Node root)  //LEVEL ORDER TRAVERSAL(WITH NEXT LINE) USING QUEUE
     {
          int prelevel=0;
          Queue<Pair> q=new ArrayDeque<>();
          if(root!=null) q.add(new Pair(root, 0));
          while(q.size()>0)
          {
               Pair a=q.remove();
               Node temp=a.node;
               int lvl=a.level;
               if(lvl!=prelevel)
               {
                    System.out.println();
                    prelevel++;
               }
               System.out.print(temp.data+" ");
               if(a.node.left!=null) q.add(new Pair(temp.left,lvl+1));
               if(a.node.right!=null) q.add(new Pair(temp.right, lvl+1));
          }
     }
     public static void main(String[] args) 
     {
    Node a=new Node(1);
    Node b=new Node(2);
    Node c=new Node(3);
    Node d=new Node(4);
    Node e=new Node(5);
    Node f=new Node(6);
    Node g=new Node(7);

    a.left=b; a.right=c;
    b.left=d; b.right=e;
    c.left=f; c.right=g;

    for(int i=0;i<level(a);i++)
    {
        nthlevel(a, 0, i);
        System.out.println();
    }
    System.out.println();

    levelordersimple(a);
    System.out.println();

    levelOrder(a); // ye practice h

    levelorder(a);
    System.out.println();
     levelSimple(a);
    }
}
