package LinkedList;

 static class Node
 {
    int data;
    Node next;
    Node(int data,Node next)
    {
      this.data = data;
      this.next = null;
    }
 }
 static class LinkedList4
 {
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
    public static void main(String[] args) 
    {
        LinkedList4 l = new LinkedList4(10);
    }
}
