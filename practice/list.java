package practice;
import java.util.*;
public class list
{
    static Node head,tail;
    static int size=0;
    static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
        }
    }
    static void display(Node head)
    {
        if(head==null)
        return;
        System.out.println(head.data);
        display(head.next);
    }
    static void displayrev(Node head)
    {
        if(head==null)
        {
            return;
        }
        displayrev(head.next);
        System.out.print(head.data+" ");
        
    }
    static void display1(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static void insertAtEnd(int x)
    {
        Node temp=new Node(x);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else
        {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    list l=new list();
    int ele;
    while(true)
    {
        ele=sc.nextInt();
        if(ele==0)
        {
            break;
        }
        insertAtEnd(ele);
    }
    /*insertAtEnd(90);
    display(head);
    System.out.println(head.data);
    System.out.println(tail.data);
    System.out.println(size);*/
    displayrev(head);
}
}

