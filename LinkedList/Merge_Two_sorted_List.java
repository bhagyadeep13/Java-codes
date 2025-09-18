package LinkedList;

public class Merge_Two_sorted_List 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode t = new ListNode(10);
        ListNode temp = t;
        while(t1!=null && t2!=null)
        {
            if(t1.data<=t2.data)
            {
                temp.next = t1;
                t1=t1.next;
            }
            else
            {
                temp.next = t2;
                t2=t2.next;
            }
            temp=temp.next;
        }
        if(t2!=null && t1==null)
        {
           temp.next = t2;
        }
        if(t1!=null && t2==null)
        {
            temp.next = t1;
        }
        return t.next;
    }
    /* This code merges two sorted linked lists into one sorted linked list by comparing their nodes one by one and attaching the smaller node to the result list. It uses a dummy node to simplify the process and returns the merged list starting from the next node after the dummy. */
  public static void main(String[] args) 
  {
        System.out.println("Done");
  }
}
