package practice;
import java.util.*;
public class r 
{
    static Node head,tail;
    static class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static void InsertAtEnd(int ele)
    {
        Node temp=head;
        Node temp1=new Node(ele);
        if(head==null)
        {
            head=temp1;
        }
        else
        {
            tail.next=temp1;
        }
        tail=temp1;
    }
    static boolean pallindrome(Node head)
    {
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        while(temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
        }
        Stack<Integer> st1=new Stack<>();
        while(st.size()>0)
        {
            if(st1.size()==0)
            {
                st1.push(st.pop());
            }
            else
            {
                if(st1.peek()==st.pop())
                {
                    st1.pop();
                }
            }
        }
       if(st1.size()==0)
       return true;
       else
       return false;
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
    System.out.println(pallindrome(head));
  }  
}
