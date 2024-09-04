
// 2670. Find the Distinct Difference Array

// You are given a 0-indexed array nums of length n.
/*The distinct difference array of nums is an array diff of length n such that diff[i] is equal to the number of distinct elements in the suffix nums[i + 1, ..., n - 1] subtracted from the number of distinct elements in the prefix nums[0, ..., i].

Return the distinct difference array of nums.

Note that nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j inclusive. Particularly, if i > j then nums[i, ..., j] denotes an empty subarray.*/

// Input: nums = [1,2,3,4,5]
//Output: [-3,-1,1,3,5]

package PrefixSum;
import java.util.*;
public class leetcode_2670 
{
    public static int diff(int[] a,int a1)
    {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            if(i<=a1)
            {
                h1.add(a[i]);
            }
            else
            {
                h2.add(a[i]);
            }
        }
        return h1.size()-h2.size();
    }
   public static void main(String[] args) 
    {
       int[] nums={1,2,3,4,5};
       int[] a= new int[nums.length];
       for(int i=0;i<nums.length;i++)
        {
            a[i]=diff(nums,i);
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

