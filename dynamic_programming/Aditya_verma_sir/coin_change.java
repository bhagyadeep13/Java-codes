package dynamic_programming.Aditya_verma_sir;

/*518. Coin Change II
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.
You may assume that you have an infinite number of each kind of coin.
The answer is guaranteed to fit into a signed 32-bit integer. */

/*Example 1:

Input: amount = 5, coins = [1,2,5]
Output: 4
Explanation: there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1 */

public class coin_change 
{
    // similar to count the subsets with given sum with unbounded nature 

    public static int Subset_sum(int[] arr,int[][] dp) // unbounded knapsack 
    {
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0] = 1;
        }
        for(int j=1;j<dp[0].length;j++)
        {
            dp[0][j] = 0;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                int skip = dp[i-1][j];
                if(arr[i-1]<=j)
                {
                    int take = dp[i][j-arr[i-1]];  // here we have change i-1 to i 
                    dp[i][j] = skip + take;
                }
                else 
                    dp[i][j] = skip;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,5}; // count subset with given sum in unbounded nature
        int sum=5;

        int[][] dp = new int[arr.length+1][sum+1];
        System.out.println(Subset_sum(arr, dp));
    }
}
