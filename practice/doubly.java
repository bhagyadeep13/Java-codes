package practice;
import java.util.*;
public class doubly 
{
    static Node head,tail;
     static int size;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
        }
    }
    static void display(Node tail)
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
   static  void insertAtEnd(int x)
    {
        Node temp=new Node(x);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            tail.next=temp;
            temp.prev=tail;
        }
        tail=temp;
        size++;
    } 
     public static void main(String[] args) 
 {
    
    Scanner sc=new Scanner(System.in);
    int ele;
    while(true)
    {
        ele=sc.nextInt();
        if(ele==0)
        break;
        insertAtEnd(ele);
    }
    display(head);
}
}
