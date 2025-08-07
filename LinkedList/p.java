package LinkedList;

class Node
{
    int data;
    Node next;
    Node(int data)
    { 
        this.data = data;
    }
} 
class LinkedList
{
    static Node head,tail;
    public void insertAtFront(int b)
    {
        Node temp = new Node(b);
        if(head==null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            temp.next = head;
            head  = temp;
        }
    }
    public void print()  // Iterative print
    {
      Node temp = head;
      while(temp != null)
      {
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
      System.out.println();
     // System.out.println(head.data);
      //System.out.println(tail.data);
    }
    public void insertAtEnd(int a)
    {
        Node temp = head;
        Node newNode = new Node(a);
        if(head==null)
        {
            insertAtFront(a);
        }
        else
        {
            tail.next = newNode;
            tail = newNode;     // tail ko newNode pe shift kar do
        }
    }
    public void insert(int a)
    {
        Node temp1 = new Node(a);
        Node temp = head;
        Node prev = null;
        while(temp!=null && temp.data<=a)
        {
            prev = temp;
            temp=temp.next;
        }
        if(prev == null)
        {
            temp1.next = temp;
            head = temp1;
        }
        else
        {
            temp1.next = temp;
            prev.next = temp1;
        }
    }
}
public class p 
{
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(3);
        ll.insertAtEnd(7);
        ll.insert(1);
        ll.print();
    }
}

    
