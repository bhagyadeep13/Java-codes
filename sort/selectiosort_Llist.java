package sort;
import java.util.*;
class selectiosort_Llist
{
    Node head,tail;
    class Node
    {
        int data;
        Node next;

    Node(int data)
    {
        this.data=data;
    }
   }
   void insertAtEnd(int x)
   {
    Node temp=new Node(x);
    if(head==null)
    {
        head=temp;
    }
    else
    {
        tail.next=temp;
    }
    tail=temp;
    }
    void selection()
    {
        Node temp=head;
        while(temp!=null)
        {
            Node min=temp;
            Node j=temp.next;
            while(j!=null)
            {
                if(j.data<min.data)
                {
                    min=j;
                }
                j=j.next;
            }
              int tem=temp.data;
                temp.data=min.data;
                min.data=tem;
                temp=temp.next;
        }
    }
    void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        selectiosort_Llist s=new selectiosort_Llist();
        int element;
        while(true)
        {
            element=sc.nextInt();
            if(element==0)
            {
                break;
            }
            s.insertAtEnd(element);
        }
        s.display();
        s.selection();
        s.display();
    }
    }
  
