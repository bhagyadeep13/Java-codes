package Heaps_priority_queue;
import java.util.*;
public class b 
{
    public static int knap(int i,int[] wt,int[] price,int C) // T.C -- O(POW(2,N)
    {
        if(i==wt.length) return 0;
        int skip = knap(i+1, wt, price, C);
        if(wt[i]>C) return skip;
        int take = price[i] + knap(i+1, wt, price, C-wt[i]);
        return Math.max(skip,take);
    }
    public static int knap2(int i,int[] wt,int[] price,int C,int[][] dp) // T.C -- O(N)
    {
        if(i==wt.length) return 0;
        if(dp[i][C]!=-1) return dp[i][C];
        int skip = knap(i+1, wt, price, C);
        if(wt[i]>C) return dp[i][C] = skip;
        int take = price[i] + knap(i+1, wt, price, C-wt[i]);
        return dp[i][C] = Math.max(skip,take);
    }
    public static void main(String[] args) 
    {
        int[] price = {5,3,9,16};
        int[] wt={1,2,8,10};
        int C = 8;
        System.out.println(knap(0, wt, price, C));

        // i -- 0 to n-1 -- len = n
        // C -- C to 0 -- len = C+1

        int[][] dp = new int[wt.length][C+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(knap2(0,wt,price,C,dp));
    }
}
