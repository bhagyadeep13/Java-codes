package dynamic_programming.Aditya_verma_sir;

public class unbounded_Knapsack 
{
    public static int knapsack(int[] val,int[] wt,int C,int n,int[][] dp)
    {
        if(n==0 || C==0) return 0;
        if(dp[n-1][C]!=0) return dp[n-1][C];
        int skip = knapsack(val, wt, C, n-1,dp);
        if(wt[n-1]<=C)
        {
            int take = val[n-1] + knapsack(val, wt, C-wt[n-1], n,dp);
            return dp[n-1][C] = Math.max(skip,take);
        }
        else 
            return dp[n-1][C] = skip;
    }
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
        int[] val={5,10,7,16};
        int[] wt ={1,2,8,10};
        int C=8;

        int[][] dp = new int[val.length][C+1];
        System.out.println(knapsack(val, wt, C, val.length,dp));

        int[][] dp1 = new int[val.length+1][C+1];
        System.out.println(knapsackTABU(val, wt,dp1));
    }
}
