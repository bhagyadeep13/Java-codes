package LinkedList;

public class p 
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static class LinkedList
    {
        Node head,tail;
        int size=0;
        public void insertAtEnd(int data)
        {
            Node n = new Node(data);
            if(head==null)
            {
                head = n;
                tail = n;
            }
            else
            {
                tail.next = n;
                tail = n;
            }
            size++;
        }
        public void print(Node head)
        {
            if(head==null) return;
            System.out.print(head.data+" ");
            print(head.next);
        }
        public void insertAtFront(int data)
        {   
            Node n = new Node(data);
            if(head==null)
            {
                head = n;
                tail = n;
            }
            else
            {
                n.next = head;
                head = n;
            }
            size++;
        }
        public void delete(int idx)
        {
            if(idx>size-1) return;
            if(size==0 || head==null) return;
            if(idx==0)
            {
                head = head.next;
                return;
            }
            Node temp=head;
            for(int i=0;i<idx-1;i++)
            {
                temp=temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtFront(3);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(3);
        ll.insertAtEnd(7);
        ll.print(ll.head);
        System.out.println();
        ll.delete(5);
        ll.print(ll.head);
    }
}

    
