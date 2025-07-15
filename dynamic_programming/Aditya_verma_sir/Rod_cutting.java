package dynamic_programming.Aditya_verma_sir;

/*Given a rod of length n inches and an array price[], where price[i] denotes the value of a piece of length i. Your task is to determine the maximum value obtainable by cutting up the rod and selling the pieces.
Note: n = size of price, and price[] is 1-indexed array. */

/*Input: price[] = [1, 5, 8, 9, 10, 17, 17, 20]
Output: 22
Explanation: The maximum obtainable value is 22 by cutting in two pieces of lengths 2 and 6, i.e., 5 + 17 = 22.
 */


 /*  SAME AS UNBOUNDED KNAPSACK */

public class Rod_cutting 
{
    public static int knapsackTABU(int[] val,int[] wt,int[][] dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0] = 0;
        }
        for(int j=1;j<dp.length;j++)
        {
            dp[0][j] = 0;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int skip = dp[i-1][j];
                if(wt[i-1]<=j)
                {
                    int take = val[i-1] + dp[i][j-wt[i-1]];
                    dp[i][j] = Math.max(skip,take);
                }
                else 
                    dp[i][j] = skip;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) 
    {
        int[] len = {1, 5, 8, 9, 10, 17, 17, 20}; // val array 
        int[] wt = new int[len.length];
        for(int i=0;i<wt.length;i++)
        {
            wt[i] = i+1;
        }
        int[][] dp1 = new int[len.length+1][wt.length+1];
        System.out.println(knapsackTABU(len, wt,dp1));
    }
}
