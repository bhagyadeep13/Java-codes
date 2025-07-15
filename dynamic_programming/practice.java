package dynamic_programming;

public class practice 
{
    public static int knapsack(int[] val,int[] wt,int n,int C)
    {
        if(n==0 || C==0) return 0;
        if(wt[n-1]<=C)
        {
            int skip = knapsack(val, wt, n-1, C);
            int take = val[n-1] + knapsack(val, wt, n-1, C-wt[n-1]);
            return Math.max(skip,take);
        }
        else
        {
            return knapsack(val, wt, n-1, C);
        }
    }
    public static int knapsackDP(int[] val,int[] wt,int n,int C,int[][] dp)
    {
        if(n==0 || C==0) return 0;
        if(dp[n][C]!=0) return dp[n][C];
        if(wt[n]<=C)
        {
            int skip = knapsack(val, wt, n-1, C);
            int take = val[n] + knapsack(val, wt, n-1, C-wt[n]);
            return dp[n][C] = Math.max(skip,take);
        }
        else
        {
            return dp[n][C] = knapsack(val, wt, n-1, C);
        }
    }
    public static void main(String[] args) 
    {
        int[] val = {5,3,9,16};
        int[] wt={1,2,8,10};
        int C = 8;
        System.out.println(knapsack(val,wt,val.length,C));

        int[][] dp = new int[val.length][C+1];
        System.out.println(knapsack(val, wt, val.length-1, C));
    }
}
