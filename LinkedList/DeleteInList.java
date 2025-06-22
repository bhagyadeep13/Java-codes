package LinkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{

  Node head,tail;
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
      System.out.println(tail.data);
    }
    public void deleteAtHead()
      {
          if(head == null) 
          {
            System.out.println("List is empty");
            return;
          }
          head = head.next;
      }
      public void deleteAtIdx(int idx)  // T.C -- O(N)
      {
          if(idx>=size)
          {
            System.out.println("Invalid Index");
            return;
          }
          if(head == null) 
          {
            System.out.println("List is empty");
            return;
          }
          else if(idx ==0 )
          {
            deleteAtHead();
          }
          else
          {
              Node temp = head;
              for(int i=0;i<idx-1;i++)
              {
                  temp= temp.next;
              }
              if(temp.next==tail)          // IMP Line
              {
                tail = temp;
              }
              temp.next = temp.next.next;
          }
          size--;
      }
}
public class DeleteInList 
{
    public static void main(String[] args) 
    {
      LinkedList ll = new LinkedList();    
      ll.insertAtFront(10);
      ll.insertAtFront(20);
      ll.insertAtFront(30);
      ll.insertAtFront(40);
      ll.insertAtFront(50);
      ll.insertAtFront(60);
      ll.print();
      ll.deleteAtIdx(ll.size-1);
      ll.print();
    }
  
}
