package Heaps_priority_queue;
import java.util.*;
public class kthLargest 
{
    public static int Largest1(int[] a,int k)  
    {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)      // T.C -- O(NLOG(K))
        {                               // S.C--O(K)
            p.add(a[i]);
            if(p.size()>k)
            {
                p.remove();
            }
        }
        return p.peek();
    }
    
    public static int Largest2(int[] a,int k)  
    {
        int val=0;
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
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
        int[] a={1,-1,5,10,8,9}; // need to find kth smallest number in the array
        int k=3;
        System.out.println(Largest1(a, k));
        
        System.out.println(Largest2(a, k));

    }
}
