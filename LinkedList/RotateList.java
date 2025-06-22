package LinkedList;

public class RotateList 
{
  public ListNode rotateRight(ListNode head, int k)  // Rotate List 
    {
        ListNode temp = head;  // Logic -- pehle remove kth node from last ka logic lagake kth node 
        ListNode slow=head;     // se ek pehle wala node nikal lo node "temp2"
        ListNode fast = head;       // phir temp2 ko store kar lo
        if(head==null) return head;  // phir temp2.next me null dal do  
        if(head==null) return head;   // phit temp3 = temp2.next
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        k=k%size;
        for(int i=0;i<k;i++)
        {
            if(fast==null) return head;
            fast=fast.next;
        }
        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp2= slow.next;
        ListNode temp3= slow.next;
        if(temp2==null) return head;
        slow.next = null;
        if(temp2==null) return head;
        while(temp2.next!=null)
        {
            temp2=temp2.next;
        }
        temp2.next = head;
        head = temp3 ;
        return head;
    }
    /*This code rotates a singly linked list to the right by k positions. It first calculates the length of the list and adjusts k if it is larger than the list size. Then, it uses two pointers to find the node where the rotation should happen, splits the list at that point, and reconnects the end of the list to the original head, making the new head the start of the rotated list. */
    
    public static void main(String[] args) {
      
    }
}
