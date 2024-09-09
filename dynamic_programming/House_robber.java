package dynamic_programming;
import java.util.*;
public class House_robber 
{
    public static int helper(int[] nums,int i,int[] dp)
    {
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+helper(nums,i+2,dp);
        int skip=helper(nums,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }

    public static int helper2(int[] nums,int i)
    {
        if(i>=nums.length) return 0;
        int take=nums[i]+helper2(nums,i+2);
        int skip=helper2(nums,i+1);
        return Math.max(take,skip);
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,1};
        int[] dp=new int[a.length];
        Arrays.fill(dp,-1);
        System.out.println(helper(a, 0, dp));
        System.out.println(helper2(a, 0));

    }
}
