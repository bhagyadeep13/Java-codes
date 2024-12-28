package Heaps_priority_queue;
import java.util.*;
public class kthSmallest 
{
    public static int smallest1(int[] a,int k)  
    {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++)
        {
            p.add(a[i]);
            if(p.size()>k)
            {
                p.remove();
            }
        }
        return p.peek();
    }

    public static int smallest2(int[] a,int k)  
    {
        int val=0;
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)      
        {                               
            p.add(a[i]);
        }
        while(k>0)
        {
            val=p.remove();
            k--;
        }
        return val;
    }
    public static void main(String[] args) 
    {
        int[] a={10,2,3,8,-4,-2,6}; // need to find kth smallest number in the array
        int k=3;
        System.out.println(smallest1(a, k));
        
        System.out.println(smallest2(a, k));

    }
}
