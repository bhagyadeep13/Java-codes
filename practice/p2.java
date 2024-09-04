package practice;
import  java.util.*;
public class p2 
{
    static Node head,tail;
    static int size=0;
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int d)
        {
            data=d;
        }
    }
    static void InsertAtEnd(int x)
    {
        Node temp=head;
        Node temp1=new Node(x);
        if(head==null)
        {
            head=temp1;
            head.prev=null;
        }
        else
        {
            tail.next=temp1;
            temp1.prev=tail;

        }
        tail=temp1;
        size++;
    }
    static int size1()
    {
        return size;
    }
    static void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static void insertAtbeg(int x)
    {
        Node temp=head;
        Node temp1=new Node(x);
        if(head==null)
        {
            head=temp1;
            tail=temp1;
        }
        else
        {
            temp1.next=head;
            head=temp1;
        }
        size++;
    }
    static int getele(int idx)
    {
        Node temp=head;
        for(int i=0;i<idx-1;i++)
        {
           temp=temp.next;
        }
        return temp.data;
    }
    static void reverse(Node head)
    {
        Node temp=head;
        if(temp==null)
        {
            return;
        }
        reverse(head.next);
        System.out.print(temp.data+" ");
    }
    static void revered(Node head)
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    static void duplicates(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.next==null)
            return;
            while(temp.data==temp.next.data)
            {
              temp.next=temp.next.next;
            if(temp.next==null)
            {
                return;
            }
        }
            temp=temp.next;
        }
    }
    static void nNode(int k)
    {
        Node temp=head;
        int s=size-k+1;
        for(int i=0;i<s-1;i++)
        {
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    static void rotate()
    {
        Node temp=head;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        k=k%size;
        tail.next=head;
        for(int i=0;i<k;i++)
        {
            temp=temp.next;
        }
        Node slow=temp;
        System.out.print(temp.data+" ");
        temp=temp.next;
        while(temp!=slow)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static void deleteeven(Node head)
    {
        LinkedList<Integer> l=new LinkedList<>();
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data%2!=0)
            {
                l.add(temp.data);
            }
            temp=temp.next;
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
    static void prosum(Node head,int k)
    {
        Node temp=head;
        int pro=1,sum=0;
        while(temp!=null)
        {
           if(temp.data%k==0)
           {
            pro=pro*temp.data;
            sum=sum+temp.data;
           }
           temp=temp.next;
        }
        System.out.println(pro);
        System.out.println(sum);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int element;
        while(true)
        {
            element=sc.nextInt();
            if(element==0)
            {
                break;
            }
            InsertAtEnd(element);
        }
        int k=sc.nextInt();
        display();
    }
}
