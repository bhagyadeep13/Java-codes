package Heaps_priority_queue;
import java.util.*;
public class MaxHeap 
{
    public static void main(String[] args) 
    {
        // Implementation of the max heap
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        p.add(1);
        System.out.println(p+" "+p.peek());
        p.add(2);
        System.out.println(p+" "+p.peek());
        p.add(1);
        System.out.println(p+" "+p.peek());
        p.add(10);
        System.out.println(p+" "+p.peek());
        p.remove();
        System.out.println(p+" "+p.peek());
        p.add(12);
        System.out.println(p+" "+p.peek());


    }
}
