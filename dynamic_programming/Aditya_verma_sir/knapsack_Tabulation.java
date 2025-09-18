package dynamic_programming.Aditya_verma_sir;

public class knapsack_Tabulation 
{
    public static int helper2(int n,int[] val,int[] wt,int C)
    {
        if(n==0) return 0;
        int skip = helper2(n-1, val, wt, C);
        if(wt[n-1]>C) return skip;
        int take=val[n-1] + helper2(n-1, val, wt,C-wt[n-1]);
        return Math.max(take,skip);
    }
    public static int helper(int[][] dp,int[] val,int[] wt,int C,int n)
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0 || j==0)
                dp[i][j] = 0;
            }
        }
        for(int i=1;i<dp.length;i++)   // n -> i and C -> j
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int skip = dp[i-1][j];
                if(wt[i-1]<=j)
                {   
                    int take = val[i-1] + dp[i-1][j-wt[i-1]];
                    dp[i][j] = Math.max(skip,take);
                }
                else
                    dp[i][j] = skip;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static int helper(int[] val,int[] wt,int C,int n)
    {
        if(n==0 || C==0) return 0;
        int skip = helper(val, wt, C, n-1);
        if(wt[n-1]<=C)
        {
            int take = val[n-1]+ helper(val, wt, C-wt[n-1], n-1);
            return Math.max(take,skip);
        }
        else
            return skip;
    }
    public static int helper3(int[] val,int[] wt,int C,int n)
    {
        if(C==0 || n<0) return 0;
        int skip = helper3(val, wt, C, n-1);
        if(wt[n]>C) return skip;
        int take = val[n] + helper3(val, wt, C-wt[n], n-1);
        return Math.max(take,skip);
    }
    public static void main(String[] args) 
    {
        int[] val = {5,3,9,16};
        int[] wt={1,2,8,10};
        int C = 8;
        int[][] dp = new int[val.length+1][C+1];
        System.out.println(helper(dp, val, wt, C, val.length));

        System.out.println(helper(val, wt, C, val.length));
        System.out.println(helper3(val, wt, C, val.length-1));

        System.out.println(helper2(val.length, val, wt, C));
    }
}
