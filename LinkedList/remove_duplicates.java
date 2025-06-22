package LinkedList;

public class remove_duplicates 
{
    public ListNode deleteDuplicates(ListNode head)  // remove duplicates(leetcode) 
    {                                               // two pointers
        if(head==null) return null;
        ListNode a = head;
        ListNode b = head;
        while(b!=null)
        {
            if(a.data == b.data) b=b.next;
            else
            {
                a.next = b;
                a=b;
            }
        }
        a.next = null;
        return head;
    }
    public static void main(String[] args) {
      
    }
}
