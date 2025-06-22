package LinkedList;

public class reorderList 
{
    class Solution {
    public static ListNode reverseList(ListNode head)
    {
        ListNode c = head;
        ListNode p = null;
        ListNode n = head;
        while(c!=null)
        {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
    public void reorderList(ListNode head) 
    {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp= temp.next;
        }
        if(size%2==0)
        {
            while(fast.next.next!=null)
            {
                slow = slow.next;
                fast=fast.next.next;
            }
        }
        else
        {
            while(fast.next!=null)
            {
                slow = slow.next;
                fast=fast.next.next;
            }
        }
        ListNode head1 = slow.next;
        slow.next = null;
        ListNode head2 = reverseList(head1);
        ListNode thead = new ListNode(10);
        ListNode t = thead;
        boolean flag = true;
        temp = head;
        while(head2!=null && temp!=null)
        {
            if(flag==true)
            {
                t.next = temp;
                t = temp;
                temp = temp.next;
            }
            else
            {
                t.next = head2;
                t = head2;
                head2 = head2.next;
            }
            flag = !flag;
        }
        if(head2!=null && temp==null)
        {
            t.next = head2;
        }
        else
        if(head2==null && temp!=null)
        {
            t.next = temp;
        }
    }
}
    public static void main(String[] args) 
    {
        /*How it works step by step:

        ✅ Step 1: Find the middle of the list
        Using slow/fast pointer — slow will point to middle node.

        ✅ Step 2: Reverse the second half of the list
        From middle’s next node → reverse the rest of the list (reverseList() function).
        
        ✅ Step 3: Merge the two halves
        Merge the first half and reversed second half alternately into final order.

 */
    }
}
