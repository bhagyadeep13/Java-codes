package dynamic_programming;
import java.util.*;
public class MinCost_climibing_Stairs 
{
    public static int climb(int[] cost,int i,int[] dp)  // TIME COMPLEXITY -- O(N)
    {
        if(i==0 || i==1) return cost[i];
        if(dp[i]!=-1) return dp[i];
        dp[i]=cost[i]+Math  .min(climb(cost,i-1,dp),climb(cost,i-2,dp));
        return dp[i];
    }
    public static int helper(int[] cost,int i)    // TIME COMPLEXITY--O(2*N);
    {
        if(i==0 || i==1) return cost[i];
        return cost[i]+Math.min(helper(cost,i-1),helper(cost,i-2));
    }

    public static int helper2(int[] cost)
    {
        int[] dp1=new int[cost.length];
        dp1[0]=cost[0];
        dp1[1]=cost[1];
        for(int i=2;i<dp1.length;i++)
        {
            dp1[i]=cost[i]+Math.min(dp1[i-1],dp1[i-2]);
        }
        return Math.min(dp1[dp1.length-1],dp1[dp1.length-2]);
    }
   public static void main(String[] args) 
   {
        int[] cost={10,15,20};
        
        int[] dp= new int[cost.length]; // 'cost.length' to '0';
        Arrays.fill(dp,-1);
        int val= Math.min(climb(cost,cost.length-1,dp),climb(cost, cost.length-2, dp));
        System.out.println(val);

        int v1=helper(cost,cost.length-1);   // METHOD 2
        int v2=helper(cost,cost.length-2);
        System.out.println(Math.min(v1,v2));

        System.out.println(helper2(cost));  // METHOD 3

   }
}
