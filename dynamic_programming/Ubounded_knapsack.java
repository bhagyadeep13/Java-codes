package dynamic_programming;
import java.util.*;
public class Ubounded_knapsack 
{
    public static int helper(int i,int[] p,int[] w,int C,int[][] dp)
    {                                       // T.C -- O(N*C)
        if(i==p.length) return 0;
        if(dp[i][C]!=-1) return dp[i][C];
        int skip = helper(i+1, p, w,C,dp);
        if(w[i]>C) return dp[i][C] = skip;
        int pick = p[i] + helper(i,p,w,C-w[i],dp);  // repeat again
        return dp[i][C] = Math.max(skip,pick);
    }
        public static void main(String[] args) 
    {
        int[] price = {5,3,7,16};
        int[] weight = {1,2,8,10};
        int C=8;    
        // i -- 0 to n-1 -- n
        // C -- C to 0 -- C+1
        int[][] dp=new int[price.length][C+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(helper(0,price,weight,C,dp));
    }
}
