package dynamic_programming;
public class knapsack 
{
    public static int knap(int i, int[] wt, int[] val,int C) // TIME COMPLEXITY -- O(POW(2,N))
    {
        if(i==wt.length) return 0;          // RECURSION
        int skip = knap(i+1,wt,val,C);
        if(wt[i]>C) return skip;
        int take = val[i] + knap(i+1,wt,val,C-wt[i]);
        return Math.max(skip,take);
    }

    public static int knap2(int i, int[] wt, int[] val,int C,int[][] dp)
    {
        if(i==wt.length) return 0;                  // TIME COMPLEXITY -- O(N*C)
        if(dp[i][C]!=0) return dp[i][C];            // RECURSION + MEMOIZATION
        int skip = knap(i+1,wt,val,C);
        if(wt[i]>C) return dp[i][C] = skip;
        int take = val[i] + knap(i+1,wt,val,C-wt[i]);
        return dp[i][C] = Math.max(skip,take);
    }
    public static void main(String[] args) 
    {
        int[] val = {5,3,9,16};
        int[] wt={1,2,8,10};
        int C = 8;
        System.out.println(knap(0, wt, val, C));

        // i from '0' to 'n-1'
        // C from 'C' to '0'
        int[][] dp=new int[wt.length][C+1];
        System.out.println(knap2(0, wt, val, C, dp));
    }
}
