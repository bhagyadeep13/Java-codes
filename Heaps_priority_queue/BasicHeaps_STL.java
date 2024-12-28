package Heaps_priority_queue;
import java.util.*;
public class BasicHeaps_STL 
{
    public static void main(String[] args) 
    {
        // By default min heap hi hota h
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(1);
        System.out.println(p+" "+p.peek());
        p.add(2);
        System.out.println(p+" "+p.peek());
        p.add(3);
        System.out.println(p+" "+p.peek());
        p.add(4);
        System.out.println(p+" "+p.peek());
        p.remove();
        System.out.println(p+" "+p.peek());
    }
}
