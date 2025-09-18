package dynamic_programming.Aditya_verma_sir;

public class Count_subset_sum 
{
    // knapSack Version

    // Count the number oof subsets that have equal sum.

    public static int helper(int[] arr,int sum,int[][] dp) // T.C -- O(N*SUM)
    {
        for(int i=0;i<dp.length;i++)   // repeated elements are allowed 
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
                    int take = dp[i-1][j-arr[i-1]];
                    dp[i][j] = take + skip;
                }
                else
                    dp[i][j] = skip;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,3};
        int sum1=5;
        int[][] dp = new int[a.length+1][sum1+1];
        System.out.println(helper(a, sum1, dp));
    }
}
