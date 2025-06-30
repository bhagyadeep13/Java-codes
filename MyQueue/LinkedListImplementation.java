package MyQueue;

class Node
{
  int data;
  Node next;
  Node(int data)
  {
    this.data = data;
  }
}
class Queue
{
  Node head;
  Node tail;
  int size=0;
  public void add(int val)
  {
    Node t = new Node(val);
    if(head==null)
    {
      head = t;
      tail = t;
    }
    else
    {
      tail.next = t;
      tail = t;
    }
    System.out.println(head.data+" "+tail.data);
    size++;
  }
  public int size()
  {
    return size;
  }
  public int remove()
  {
    if(head==null) 
    {
      System.out.println("Queue is Empty");
      return -1;
    }
    size--;
    int val = head.data;
    head=head.next;
    return val;
  }
  public int peek()
  {
    if(head==null) 
    {
      System.out.println("Queue is Empty");
      return -1;
    }
    return head.data;
  }
  public boolean isEmpty()
  {
    if(size==0) return true;
    else return false;
}
public void display(Node head)
{
  if(head==null) return;
  Node temp = head;
  System.out.print(temp.data+" ");
  display(head.next);
}
public void displayReverse(Node head)
{
  if(head==null) return;
  Node temp = head;
  displayReverse(temp.next);
  System.out.print(temp.data+" ");
}
}
public class LinkedListImplementation 
{
  public static void main(String[] args) 
  {
      Queue q = new Queue();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.display(q.head);
      System.out.println();
      q.remove();
      q.remove();
      q.remove();
      q.remove();
      System.out.println(q.isEmpty());
  }
}

