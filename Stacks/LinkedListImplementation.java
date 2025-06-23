package Stacks;
class Node
{
  int data;
  Node next;
  Node(int data)
  {
    this.data = data;
  }
}
class Stacks
{
    Node head = null;
    Node tail = null;
    int size=0;
    public void push(int n)
    {
        Node newNode = new Node(n);
        if(head == null)
        {
          head = newNode;
          tail = newNode;
        }
        else
        {
          tail.next = newNode;
          tail = newNode;
        }
        size++;
    }
    public int peek()
    {
      if(head == null) 
      {
        System.out.println("Stack is Empty");
        return Integer.MIN_VALUE;
      }
      return tail.data;
    }
    public int size()
    {
      return size;
    }
    public int pop()
    {
      if(size==0)
      {
        System.out.println("stack is empty");
        return Integer.MIN_VALUE;
      }
      size--;
      int val = tail.data;
      if(head.next == null)
      {
        head = null;
        tail = null;
        return val;
      }
      Node temp = head;
      while(temp.next.next!=null)
      {
          temp = temp.next;
      }
      temp.next = null;
      tail = temp;
      return val;
    }
    public boolean isEmpty()
    {
      if(size==0)
      return true;
      else return false;
    }
    public void display()
    {
      Node temp = head;
      while(temp!=null)
      {
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
      System.out.println(head.data+" "+tail.data);
    }
}
public class LinkedListImplementation 
{
    public static void main(String[] args) {
      Stacks st = new Stacks();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.display();
      System.out.println(st.peek());
      System.out.println(st.pop());
      st.display();
      st.pop();
      st.pop();
    }
}
