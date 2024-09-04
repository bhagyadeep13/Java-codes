package sort;
import java.util.*;
public class c 
{
    public static class ListNode
    {
        ListNode next;
        int val;
        ListNode(int val)
        {
            this.val=val;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) 
    {
        TreeMap<Integer,Integer> h=new TreeMap<>();
        ListNode temp=head;
        ListNode head2=new ListNode(10);
        ListNode temp2=head2;
        while(temp!=null)
        {
            if(h.containsKey(temp.val))
            {
                int freq=h.get(temp.val);
                h.put(temp.val,freq+1);
            }
            else
            {
                h.put(temp.val,1);
            }
            temp=temp.next;
        }
        System.out.println(h);
        for(int ele : h.keySet())
        {
            if(h.get(ele)==1)
            {
                ListNode n=new ListNode(ele);
                temp2.next=n;
                temp2=n;
            }
        }
        return head2.next;
    }

    public static void display(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
         ListNode a=new ListNode(-3);
         ListNode b=new ListNode(-1);
         ListNode c=new ListNode(0);
         ListNode d=new ListNode(0);
         ListNode e=new ListNode(0);
         ListNode f=new ListNode(3);
         ListNode g=new ListNode(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(deleteDuplicates(a));
    }
}
