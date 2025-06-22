package LinkedList;

public class splitLinkedInParts 
{
  class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) 
    {
        ListNode temp = head;
        int l=0;
        while(temp!=null)
        {
            l++;
            temp = temp.next;
        }
        int size = l/k;
        int extra = l%k;
        int len = 1;
        ListNode[] arr = new ListNode[k];
        int i=0;
        temp = head;
        while(temp!=null)
        { 
            int s = size;
            if(extra>0)
            {
                s++;
            }
            if(len==1) arr[i++] = temp;
            if(len==s)
            {
                ListNode a = temp.next;
                temp.next = null;
                temp = a;
                len = 1;
                extra--;
            }
            else
            {
                len++;
                temp = temp.next;
            }
        }
        return arr;
    }
} public static void main(String[] args) {
    /*
     * Summary:
Splits the list into k parts as evenly as possible

Stores parts in arr[]

Returns the array of list heads
     */
}
}
