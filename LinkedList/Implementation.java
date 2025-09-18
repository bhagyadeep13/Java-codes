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
    public int getEle(int idx)                   //  T.C - O(N), S.C - O(1)
    {
        if(idx>=size) 
        {
          System.out.println("Invalid index");
          return 0;
        }
        Node temp = head;
        for(int i=0;i<=idx-1;i++)
        {
            temp = temp.next;
        }
        return temp.data;
    }
  }
public class Implementation 
{
  public static void main(String[] args) 
  {
      LinkedList ll = new LinkedList();    
      ll.insertAtFront(10);
      ll.insertAtFront(20);
      ll.insertAtFront(30);
      ll.insertAtEnd(40);
      ll.insertAtEnd(50);
      ll.insertAtEnd(60);
      ll.insertAtIdx(1,70);
      ll.print();
      System.out.println(ll.getEle(ll.size-1));
      System.out.println(ll.getEle(0));
      System.out.println(ll.size);
  }
}


// Limitation of linkedList 

// 1) In array to get ele AND SET ELE METHOD 
/*
    In array 
    T.C -- O(1)
    S.C -- O(1)

    IN LINKEDLIST
    T.C -- O(N)
    S.C -- O(1)
 */