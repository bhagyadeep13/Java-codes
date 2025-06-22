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
class LinkedList
  {
      Node head;
      Node tail;
      int size=0;
      public void insertAtFront(int val)
      {
          Node temp = new Node(val);
          if(head==null)
          {
            head = tail = temp;
          }
          else
          {
            temp.next = head;
            head = temp;     // head temp ke pass chala gya
          }
          size++;
      }
      public void insertAtEnd(int data)
      {
        if(head==null)
        {
          insertAtFront(data);
        }
        else
        {
          Node t = new Node(data);
          tail.next = t;
          tail = t; 
        }
        size++;
      }
      public void insertAtIdx(int idx,int data)    //  T.C - O(N), S.C - O(1)
      {
          if(idx>size)
          {
            System.out.println("Invalid Index");
            return;
          }
          if(idx == 0)
          {
            insertAtFront(data);
          }
          else
          if(idx == size)
          {
            insertAtEnd(data);
          }
          else
          {
          Node temp = head;
          Node t = new Node(data);
          for(int i=0;i<idx-1;i++)
          {
            temp = temp.next;
          }
          t.next = temp.next;
          temp.next = t;
        }
        size++;
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
    public int middleElement()        // T.C - O(N)
    {
        Node temp = head;
        Node slow = head;
        Node fast = head;
        int len = 0;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        if(len%2!=0)          // odd length list
        {
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
        }
        else                     // even length list
        {
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
        }
    }
  }
public class MiddleEle 
{
    public static void main(String[] args) {
      LinkedList ll = new LinkedList();    
      ll.insertAtFront(10);
      ll.insertAtFront(20);
      ll.insertAtFront(30);
      ll.insertAtFront(40);
      ll.print();
      System.out.println(ll.middleElement());
    }
}
