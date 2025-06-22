package LinkedList;

public class reverseList 
{
  class Solution {
    public ListNode reverseList(ListNode head) 
    {
        ListNode c = head;
        ListNode n = head;
        ListNode p = null;
        while(c!=null)
        {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
}
  public static void main(String[] args) 
  {
    
  }
}
