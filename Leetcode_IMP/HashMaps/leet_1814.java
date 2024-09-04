
// 1814. Count Nice Pairs in an Array

//You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the non-negative integer x. For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it satisfies all of the following conditions:
 // 1)-- 0 <= i < j < nums.length
// 2)--nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
//Return the number of nice pairs of indices. Since that number can be too large, return it modulo 10.pow(9) + 7.


package Leetcode_IMP.HashMaps;
import java.util.*;
public class leet_1814 
{
    public static int rev(int n)  // reverse of a number
    {
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) 
    {
        int count=0;
        HashMap<Integer,Integer> h=new HashMap<>(); // hashmap(nums[i]-rev(nums[i]),freq)
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]-rev(nums[i])))
            {
                int freq=h.get(nums[i]-rev(nums[i]));
                count=count+freq;
                count=count%1000000007;          // For this see the question last line
                h.put(nums[i]-rev(nums[i]),freq+1);
            }
            else
            h.put(nums[i]-rev(nums[i]),1);
        }
        return count;
}
    public static void main(String[] args) 
    {
        int[] a={13,10,35,24,76}; 
    }
}
