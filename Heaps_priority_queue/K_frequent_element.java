package Heaps_priority_queue;
import java.util.*;
public class K_frequent_element 
{
    static class Pair implements Comparable<Pair>
    {
        int key;
        int val;
        Pair(int key,int val)
        {
            this.key=key;
            this.val=val;
        }
        public  int compareTo(Pair p)
        {
            return this.val-p.val;
        }
    }
    public static int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
            {
                int freq=h.get(nums[i]);
                h.put(nums[i],freq+1);
            }
            else
                h.put(nums[i],1);
        }
        PriorityQueue<Pair> p=new PriorityQueue<>();
        for(int ele : h.keySet())
        {
            Pair pa=new Pair(ele,h.get(ele));
            p.add(pa);
            while(p.size()>k)
            {
                p.remove();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<p.size();i++)
        {
            Pair p2=p.remove();
            ans[i]=p2.key;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] a={1,1,1,2,2,3};
        int k=2;
        int[] ans=topKFrequent(a, k);
    }
}
