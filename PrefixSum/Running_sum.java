
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.

package PrefixSum;
import java.util.*;
public class Running_sum 
{
    public static int[] runningSum(int[] nums) 
    {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,6};
        int[] ans=runningSum(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
