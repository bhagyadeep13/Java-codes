package LinkedList;
class Node
    {
        int data;
        Node next;
        Node(int data)
        {
          this.data=data;
        }
    }

public class recursivePrint
{
    public static void print(Node head)  // Recursive print
    {
      if(head==null) return;
      System.out.print(head.data+" ");
      print(head.next);
    }
    public static void reversePrint(Node head)  // Recursive Reverse Print
    {
      if(head==null) return;
      reversePrint(head.next);
      System.out.print(head.data+" ");
    }
    public static void main(String[] args) 
    {
      Node n = new Node(10);
      Node n1 = new Node(20);
      Node n2 = new Node(30);
      Node n3 = new Node(40);
      Node n4 = new Node(50);
      n.next = n1;  // linking
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;

      print(n);
      System.out.println();
      reversePrint(n);
      
    }
}
