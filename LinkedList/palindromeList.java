package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class palindromeList 
{
    class Solution {
    public boolean isPalindrome(ListNode head) 
    {
        List<Integer> al= new ArrayList<>();
        ListNode temp = head;
        ListNode head1 = new ListNode(10);
        ListNode temp1 = head1;
        ListNode temp2 = null;
        while(temp!=null)
        {
            ListNode n =new ListNode(temp.data);
            n.next = temp2;
            temp2 = n;
            temp=temp.next;
        }
        temp = head;
        while(temp2!=null)
        {
            if(temp2.data != temp.data) return false;
            temp2=temp2.next;
            temp=temp.next;
        }
        return true;
    }
  }
    public static void main(String[] args) {
      
    }
}

