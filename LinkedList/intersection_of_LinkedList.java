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
    public Node intersection(Node headA,Node headB)  // Intersection of list
    {
        Node temp1 = headA;
        Node temp2 = headB;
        int l1=0,l2=0;
        while(temp1!=null)
        {
            l1++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            l2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(l1>l2)
        {
            for(int i=0;i<(l1-l2);i++)
            {
                temp1=temp1.next;
            }
        }
        if(l2>l1)
        {
            for(int i=0;i<(l2-l1);i++)
            {
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
  }
public class intersection_of_LinkedList 
{
  public static void main(String[] args) {
    LinkedList ll1 = new LinkedList();
    LinkedList ll2 = new LinkedList();

    ll1.insertAtEnd(4);
    ll1.insertAtEnd(1);
    ll1.insertAtEnd(8);
    ll1.insertAtEnd(4);
    ll1.insertAtEnd(5);
    ll1.print();

    ll2.insertAtEnd(5);
    ll2.insertAtEnd(6);
    ll2.insertAtEnd(1);
    ll2.insertAtEnd(8);
    ll2.insertAtEnd(4);
    ll2.insertAtEnd(5);
    ll2.print();
    
  }
}
