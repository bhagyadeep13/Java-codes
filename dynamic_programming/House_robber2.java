package dynamic_programming;
import java.util.*;
public class House_robber2 
{
    public static int amount1(int[] nums)  // nums Array From index '1' to 'n-1'
    {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
       int[] dp=new int[nums.length-1];
       dp[0]=nums[1];
       dp[1]=Math.max(nums[1],nums[2]);
       for(int i=3;i<nums.length;i++)
       {
            dp[i-1]=Math.max(nums[i]+dp[i-3],dp[i-2]);
       }
       return dp[dp.length-1];
    }
    public static int amount2(int[] nums)  // nums Array From index '2' to 'n'(rotation)
    {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        if(nums.length==3) return Math.max(nums[0],nums[2]);
       int[] dp=new int[nums.length-1];
       dp[0]=nums[2];
       dp[1]=Math.max(nums[2],nums[3]);
       int i;
       for(i=4;i<nums.length;i++)
       {
            dp[i-2]=Math.max(nums[i]+dp[i-4],dp[i-3]);
       }
       dp[i-2]=Math.max(nums[0]+dp[i-4],dp[i-3]);
       return dp[dp.length-1];
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,1};
        System.out.println(Math.max(amount1(a),amount2(a)));
    }
}
