// 1679. Max Number of K-Sum Pairs

// You are given an integer array nums and an integer k.
//In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
//Return the maximum number of operations you can perform on the array.


package Leetcode_IMP.HashMaps;
import java.util.*;
public class leet_1679 
{
    public static int maxOperations(int[] nums, int k) 
    {
        int count=0;
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
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(k-nums[i]) && h.containsKey(nums[i]))
            {
                int freq1=h.get(k-nums[i]);
                h.put(k-nums[i],freq1-1);
                if(h.get(k-nums[i])==0) h.remove(k-nums[i]);
                if(h.get(nums[i])!=null)
                {
                h.put(nums[i],h.get(nums[i])-1);
                if(h.get(nums[i])==0) h.remove(nums[i]);
                count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a={2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
        System.out.println(maxOperations(a, 3));
    }
}
