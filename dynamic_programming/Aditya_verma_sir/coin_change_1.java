package dynamic_programming.Aditya_verma_sir;

/*You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin. */

/*Example 1:
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1 */

public class coin_change_1 
{
    // unbounded knapsack
    public static long Unknapsack(int[] arr,long[][] dp) // unbounded knapsack 
    {
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0] = 0;
        }
        for(int j=1;j<dp[0].length;j++)
        {
            dp[0][j] = Integer.MAX_VALUE-1;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                long skip = dp[i-1][j];
                if(arr[i-1]<=j)
                {
                    long take = 1+dp[i][j-arr[i-1]];  // here we have change i-1 to i 
                    dp[i][j] = Math.min(skip,take); // we have to find min coins count to make amount
                }
                else 
                    dp[i][j] = skip;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    public static long helper(int[] arr,int i,int sum,long[][] dp)
    {
        if(i==arr.length) return Integer.MAX_VALUE;
        if(sum==0) return 0;
        if(dp[i][sum]!=0) return dp[i][sum];
        long skip = helper(arr, i+1,sum,dp);
        if(arr[i]<=sum)
        {
            long take = 1+helper(arr, i, sum-arr[i],dp);
            return dp[i][sum] = Math.min(skip,take);
        }
        else
        {
            return dp[i][sum] = skip;
        }
    }
    public static void main(String[] args) 
    {
        int[] val = {1,2,3};
        int sum = 5;

        long[][] dp = new long[val.length+1][sum+1];
        System.out.println(Unknapsack(val, dp));

        long[][] dp1 = new long[val.length][sum+1];
        System.out.println(helper(val, 0, sum,dp1));
    }
}
