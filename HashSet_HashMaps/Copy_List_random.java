
// 138. Copy List with Random Pointer

package HashSet_HashMaps;
import java.util.*;
public class Copy_List_random 
{
    static Node head,tail;
    static class Node
    {
       Node next;
       int data;
       Node random;
       Node(int data)
       {
        this.data=data;
       }
    }
    public static Node copyList(Node head)
    {
        if(head==null) return null;

        Node temp=head.next;                        // deep copy of LinkedList
        Node head2=new Node(head.data);
        Node temp2=head2;
        while(temp!=null)
        {
            Node dup=new Node(temp.data);
            temp2.next=dup;
            temp2=dup;
            temp=temp.next;
        }
        temp=head;
        temp2=head2;

        HashMap<Node,Node> h=new HashMap<>();         // hashmap(original,duplicate)
        while(temp!=null)
        {
            h.put(temp, temp2);
            temp=temp.next;
            temp2=temp2.next;
        }

        for(Node original : h.keySet())            // storing random node
        {
            Node duplicate=h.get(original);
            if(original!=null)
            duplicate.random=h.get(original.random);
        }
        return head2;
    }
    public static void display(Node head)        // print LinkedList
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void random(Node head)        // print random nodes in LinkedList
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.random==null)
            System.out.print(temp.random+" ");
            else
            System.out.print(temp.random.data+" ");

            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Node a=new Node(7);
        Node b=new Node(13);
        Node c=new Node(11);
        Node d=new Node(10);
        Node e=new Node(1);

        a.next=b; b.next=c;
        c.next=d; d.next=e;
        e.next=null;

        a.random=null; b.random=a;
        c.random=e; d.random=c;
        e.random=a;

        display(copyList(a));
        random(a);
    }
}
