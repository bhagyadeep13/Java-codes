package dynamic_programming.Aditya_verma_sir;

public class p 
{
    public static int helper(int[] p,int[] wt,int n,int C)
    {
        if(n==0 || C==0) return 0;
        int skip = helper(p, wt, n-1, C);
        if(wt[n-1]>C) return skip;
        int take = p[n-1] + helper(p, wt, n-1, C-wt[n-1]);
        return Math.max(skip,take);
    }

    public static int helper2(int[] p,int[] wt,int n,int C,int[][] dp)
    {
        if(n==0 || C==0) return 0;
        if(dp[n-1][C]!=0) return dp[n-1][C];
        int skip = helper2(p, wt, n-1, C,dp);
        if(wt[n-1]>C) return dp[n-1][C] = skip;
        int take = p[n-1] + helper2(p, wt, n-1, C-wt[n-1],dp);
        return dp[n-1][C] = Math.max(skip,take);
    }
    public static long helper3(int[] a,int sum,long[][] dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0] = 0;
        }
        for(int i=1;i<dp[0].length;i++)
        {
            dp[0][i] = Integer.MAX_VALUE-1;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                long skip = dp[i-1][j];
                if(a[i-1]<=j)
                {
                    long take = 1+dp[i][j-a[i-1]];
                    dp[i][j] = Math.min(skip,take);
                }
                else
                {
                    dp[i][j] = skip;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) 
    {
        int[] p={5,3,9,90};
        int[] wt={1,2,8,10};
        int C = 9;
        System.out.println(helper(p, wt, p.length, C));
        
        int[] a = {1,2,5};
        int sum=11;
        long[][] dp = new long[a.length+1][sum+1];
        System.out.println(helper3(a,C,dp));
    }
}
