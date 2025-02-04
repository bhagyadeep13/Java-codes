// 136. Single Number

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space. */

/*Example 1:
Input: nums = [2,2,1]
Output: 1*/

package Bit_manipulation;
import java.util.*;
public class single_number 
{
    public static int singleNumber(int[] nums)  // XOR operation is associative
    {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans=ans^nums[i];
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
