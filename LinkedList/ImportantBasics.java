package LinkedList;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ImportantBasics 
{
    public static void main(String[] args) {
        // Create list: 10 -> 20 -> 30
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);

        // temp points to same node as head
        ListNode temp = head;

        // Print original head and temp data
        System.out.println("head.data = " + head.data); // 10
        System.out.println("temp.data = " + temp.data); // 10

        // Change data through temp
        temp.data = 99;
        System.out.println("\nAfter temp.data = 99:");
        System.out.println("head.data = " + head.data); // 99 — node content changed
        System.out.println("temp.data = " + temp.data); // 99

        // Move temp to next node
        temp = temp.next;
        System.out.println("\nAfter temp = temp.next:");
        System.out.println("head.data = " + head.data); // 99 — head still points to first node
        System.out.println("temp.data = " + temp.data); // 20 — temp points to next node

        // Move head to next node
        head = head.next;
        System.out.println("\nAfter head = head.next:");
        System.out.println("head.data = " + head.data); // 20
        System.out.println("temp.data = " + temp.data); // 20 — temp was already here
    }
}
