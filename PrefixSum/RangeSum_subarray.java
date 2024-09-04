// 1508. Range Sum of Sorted Subarray Sums.

// You are given the array nums consisting of n positive integers. You computed the sum of all non-empty continuous subarrays from the array and then sorted them in non-decreasing order, creating a new array of n * (n + 1) / 2 numbers.

// Return the sum of the numbers from index left to index right (indexed from 1), inclusive, in the new array. Since the answer can be a huge number return it modulo 109 + 7.

/*  Example 1:
Input: nums = [1,2,3,4], n = 4, left = 1, right = 5
Output: 13 
Explanation: All subarray sums are 1, 3, 6, 10, 2, 5, 9, 3, 7, 4. After sorting them in non-decreasing order we have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10]. The sum of the numbers from index le = 1 to ri = 5 is 1 + 2 + 3 + 3 + 4 = 13. */


package PrefixSum;
import java.util.*;
public class RangeSum_subarray 
{
    public static int rangeSum(int[] nums, int left, int right) 
    {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+nums[k];
                }
                al.add(sum);
            }
        }
        Collections.sort(al);
        System.out.println(al);
        int sum1=0;
        for(int i=left;i<=right;i++)
        {
            sum1=sum1+al.get(i);
        }
        return sum1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int left=1;
        int right=5;
        System.out.println(rangeSum(a, left-1, right-1));
    }
}
