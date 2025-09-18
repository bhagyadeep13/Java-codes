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
            this.key = key;
            this.val = val;
        }
        public int compareTo(Pair p)
        {
            return this.val - p.val;
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
        PriorityQueue<Pair> pa = new PriorityQueue<>();
        for(int ele : h.keySet())
        {
            pa.add(new Pair(ele, h.get(ele)));
            if(pa.size()>k)
            {
                pa.remove();
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = pa.remove().key;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] a={1,1,1,2,2,3};
        int k=2;
        int[] ans=topKFrequent(a, k);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
