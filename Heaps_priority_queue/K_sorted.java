package Heaps_priority_queue;
import java.util.*;
public class K_sorted 
{
    public static void main(String[] args) 
    {
        int[] a={6,5,4,3,2,8,10,9};
        int k=4;
        PriorityQueue<Integer> p=new PriorityQueue<>();  // MIN HEAP
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++)             // T.C -- O(N*LOG(K))
        {
            p.add(a[i]);
            if(p.size()>k)
            {
                al.add(p.remove());
            }
        }
        int val=p.size();
        for(int i=0;i<val;i++)
        {
            al.add(p.remove());
        }
        System.out.println(al);
    }
}
