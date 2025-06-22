package LinkedList;
import java.util.*;

class Node
    {
        int data;
        Node next;
        Node(int data)
        {
          this.data=data;
        }
    }

public class LinkedListClass
{
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

      Node temp = n;
      while(temp!=null)                 // Display LinkedList Using Shallow copy
      {
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
      Node deepCody = new Node(n.data); // deep copy of node
    }
}
