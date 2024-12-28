// 2915. Length of the Longest Subsequence That Sums to Target

/*You are given a 0-indexed array of integers nums, and an integer target.
Return the length of the longest subsequence of nums that sums up to target. If no such subsequence exists, return -1.
A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements. */

/*Input: nums = [1,2,3,4,5], target = 9
Output: 3 */

package dynamic_programming;
import java.util.*;
public class knapsack2 
{
    public static int helper1(int i,List<Integer> nums,int t) // T.C -- O(pow(2,N))
    {                                                      // RECURSION 
        if(i==nums.size())
        {
            if(t==0) return 0;
            else return Integer.MIN_VALUE;
        }
        int skip = helper1(i+1,nums,t);
        if(nums.get(i)>t) return skip;
        int take = 1 + helper1(i+1,nums,t-nums.get(i));
        return Math.max(skip,take);
    }
    public static int helper(int i,List<Integer> nums,int t,int[][] dp) // T.C -- O(N*T)
    {                                                      // RECURSION + MEMOIZATION
        if(i==nums.size())
        {
            if(t==0) return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[i][t]!=0) return dp[i][t];
        int skip = helper(i+1,nums,t,dp);
        if(nums.get(i)>t) return dp[i][t] = skip;
        int take = 1 + helper(i+1,nums,t-nums.get(i),dp);
        return dp[i][t] = Math.max(skip,take);
    }
    public static void main(String[] args) 
    {
        List<Integer> nums=new ArrayList<>();
        int target=9;
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(helper1(0, nums, target));

        int[][] dp=new int[nums.size()][target+1];
        // i -- 0 to n-1 -- n
        // t -- t to 0 -- t+1
        int val =helper(0,nums,target,dp);
        if(val<0) System.out.println(-1);
        else System.out.println(val);
    }
}
