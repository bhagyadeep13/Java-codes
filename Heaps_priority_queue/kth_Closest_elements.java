package Heaps_priority_queue;
import java.util.*;
public class kth_Closest_elements 
{
    public static class Pair implements Comparable<Pair>
    {
        int d;
        int val;
        Pair(int d,int val)
        {
            this.d=d;
            this.val=val;
        }
        public int compareTo(Pair p)
        {
            if(this.d==p.d)
            {
                return this.val-p.val;
            }
            return this.d-p.d;
        }
    }
    public static void helper(int[] a,int k,int x)
    {
        PriorityQueue<Pair> pa=new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int dis=Math.abs(a[i]-x);
            Pair p=new Pair(dis,a[i]);
            pa.add(p);
            if(pa.size()>k)
            {
                pa.remove();
            }
        }
        while(pa.size()>0)
        {
            Pair p2=pa.remove();
            al.add(p2.val);
        }
        Collections.sort(al);
        System.out.println(al);
    }
    public static void main(String[] args) 
    {
        int[] a={1,1,2,3,4,5};
        int k=4;
        int x=-1;
        helper(a, k, x);
    }
}
