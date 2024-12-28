package dynamic_programming;
import java.util.*;
public class target_sum_knapsack 
{
    public static int helper(int i,int[] nums,int t)
    {                                   // Recursion     
        if(i==nums.length)              // T.C -- O(pow(2,N))
        {
            if(t==0) return 1;// one way
            else return 0;
        }
        int add = helper(i+1,nums,t-nums[i]);
        int sub = helper(i+1, nums, t+nums[i]);
        return add + sub;
    }
    public static int helper2(int i,int[] nums,int res,int t,int[][] dp,int sum)
    {                                   // Recursion + memoization
        if(i==nums.length)              // T.C -- O(n*sum)
        {
            if(res==t) return 1;// one way
            else return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int add = helper2(i+1,nums,res-nums[i],t,dp,sum);
        int sub = helper2(i+1,nums,res+nums[i],t,dp,sum);
        return dp[i][res+sum] = (add + sub);
    }
    public static void main(String[] args) 
    {
        int[] a= {1,1,1,1,1};
        int t=3;
        System.out.println(helper(0, a, t));

        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        } 
        // i -- 0 to n-1 -- n
        // t -- -sum to sum -- 2*sum+1
        int[][] dp=new int[a.length][2*sum+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(helper2(0, a,0, t, dp,sum));
    }
}
