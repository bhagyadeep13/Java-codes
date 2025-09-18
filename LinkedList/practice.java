package LinkedList;

public class practice {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList2
    {
        static Node head,tail;
        public void display(Node head)
        {
            if(head==null) return;
            System.out.print(head.data+" ");
            display(head.next);
        }
        public void insertAtEnd(int n)
        {
            Node temp = new Node(n);
            if(head==null)
            {
                head = temp;
                tail = temp;
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }
        }
        public void insert(int n,int idx)
        {
            Node temp = new Node(n);
            Node temp1 = head;
            if(idx==0)
            {
                insertAtFront(n);
                return;
            }
            if(idx==n)
            {
                insertAtEnd(n);
                return;
            }
            for(int i=0;i<idx-1;i++)
            {
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            temp1.next = temp;
        }
        public static void deleteAtIdx(int idx)
        {
            if(head==null) return;
            if(head.next==null || idx==0) 
            {
                head= head.next;
                return;
            }
            else
            {
                Node temp = head;
                for(int i=0;i<idx-1;i++)
                {
                    temp=temp.next;
                }
                if(temp.next!=null) temp.next = temp.next.next;
            }
        }
        public void insertAtFront(int n)
        {
            Node temp = new Node(n);
            if(head==null)
            {
                head = temp;
                tail = temp;
            }
            else
            {
                temp.next = head;
                head=temp;
            }
        }
    }
    public static void main(String[] args) {

        LinkedList2 ll = new LinkedList2();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtFront(40);
        ll.insert(30, 3);
        ll.display(ll.head);
        ll.deleteAtIdx(3);
        System.out.println();
        ll.display(ll.head);
    }
}
