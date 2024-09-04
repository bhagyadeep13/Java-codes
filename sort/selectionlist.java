package sort;
import java.util.*;
class SelectionSort2
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
        Node j=temp.next;
        int tem=0;
        while(temp!=null)
        {
            while(j!=null)
            {
                if(j.data<temp.data)
                {
                tem=temp.data;
                temp.data=j.data;
                j.data=tem;
                }
                j=j.next;
            }
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
        SelectionSort2 s=new SelectionSort2();
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
  
