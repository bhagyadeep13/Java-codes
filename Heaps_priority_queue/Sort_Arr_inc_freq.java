// 1636. Sort Array by Increasing Frequency
/*
 Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
Return the sorted array.
 */

 /*Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
  */

package Heaps_priority_queue;
import java.util.*;
public class Sort_Arr_inc_freq 
{
    public static class Pair implements Comparable<Pair>
    {
        int key;
        int val;
        Pair(int key,int val)
        {
            this.key=key;
            this.val=val;
        }
        public int compareTo(Pair p)
        {
            if(this.val==p.val)
            {
                return p.key-this.key; 
            }
            else
                return this.val-p.val;
        }
    }
    public static int[] frequencySort(int[] nums) 
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
            {
                h.put(nums[i],1);
            }
        }
        PriorityQueue<Pair> pa=new PriorityQueue<>();
        int[] ans=new int[nums.length];
        for(int ele : h.keySet())
        {
            Pair p=new Pair(ele, h.get(ele));
            pa.add(p);
        }
        int l=0;
        while(pa.size()>0)
        {
            Pair p2=pa.remove();
            int val=p2.val;
            while(val>0)
            {
                ans[l]=p2.key;
                l++;
            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] a={2,3,1,3,2};
        frequencySort(a);
    }
}
