// 198. House Robber

/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police. */

/*Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4. */

package dynamic_programming;
import java.util.*;
public class House_robber 
{
    public static int helper(int[] nums,int i,int[] dp) // TIME COMPLEXITY -- O(N)
    {
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+helper(nums,i+2,dp);
        int skip=helper(nums,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }

    public static int helper2(int[] nums,int i)  // TIME COMPLEXITY -- O(POW(2,N))
    {
        if(i>=nums.length) return 0;
        int take=nums[i]+helper2(nums, i+2);
        int skip=helper2(nums, i+1);
        return Math.max(take,skip);
    }

    public static int helper3(int[] nums)
    {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[dp.length-1];
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,1};
        int[] dp=new int[a.length];
        Arrays.fill(dp,-1);
        System.out.println(helper(a, 0, dp));
        System.out.println(helper2(a, 0));
        System.out.println(helper3(a));
    }
}
