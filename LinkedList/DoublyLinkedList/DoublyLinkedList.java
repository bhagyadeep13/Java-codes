package LinkedList.DoublyLinkedList;
class Node 
{
  int data;
  Node next;
  Node prev;
  Node(int data)
  {
    this.data = data;
    this.prev = null;
    this.next = null;
  }
}
class DoublyList  
{
    Node head;
    Node tail;
    int size=0;
    public void display()
    {
      Node temp = head;
      while(temp!=null)
      {
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.println();
    }
    public void insertAtFront(int val)
    {
        Node n = new Node(val);
        if(head == null)
        {
          head = n;
          tail = n;
        }
        else
        {
          n.next = head;
          head.prev = n;
          head = n;
        }
        size++;
    }
    public void insertAtEnd(int val)
    {
        Node n = new Node(val);
        if(head == null)
        {
          head = n;
          tail = n;
        }
        else
        {
          tail.next = n;
          n.prev = tail;
          tail = n;
        }
        size++;
    }

    public void insertAtIdx(int idx,int val)
    {
        Node n = new Node(val);
        if(idx>size)
        {
          System.out.println("Invalid Index");
          return;
        }
        if(idx==0) insertAtFront(val);
        else if(idx==size) insertAtEnd(val);
        else
        {
          Node temp = head;
          for(int i=0;i<idx-1;i++)
          {
             temp=temp.next;
          }
          n.next = temp.next;
          temp.next = n;
          n.prev = temp;
        }
    }
    public void printByTail()
    {
        Node temp = tail;
        while(temp!=null)
        {
          System.out.print(temp.data+" ");
          temp=temp.prev;
        }
        System.out.println();
    }
    public void deleteAtFront()
    {
        if(head==null)
        {
          System.out.println("List is empty");
          return;
        }
        head = head.next;
        head.prev = null;
    }
    public void deleteAtIdx(int idx)
    {
        if(idx>=size)
        {
          System.out.println("Invalid Index");
          return;
        }
        if(idx==0) deleteAtFront();
        else if(idx==size-1) 
        {
          tail=tail.prev;
          tail.next = null;
        }
        else
        {
          Node temp = head;
          for(int i=0;i<idx-1;i++)
          {
             temp=temp.next;
          }
          temp.next = temp.next.next;
          temp.next.next.prev = temp.next;
        }
    }
}
public class DoublyLinkedList 
{
  public static void main(String[] args) 
  {
      DoublyList ll = new DoublyList();
      ll.insertAtEnd(1);
      ll.insertAtEnd(2);
      ll.insertAtEnd(3);
      ll.insertAtEnd(4);
      ll.insertAtEnd(5);
      ll.display();
      ll.insertAtIdx(ll.size, 6);
      ll.display();
      ll.deleteAtIdx(ll.size-1);
      ll.display();
  }
}
