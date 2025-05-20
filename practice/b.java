package practice;
import java.util.*;
public class b 
{
    public static int knap(int i,int[] wt,int[] val,int C,int[][] dp)
    {
        if(i==val.length) return 0;
        if(dp[i][C]!=0) return dp[i][C];
        int skip = knap(i+1, wt, val, C,dp);
        if(wt[i]>C) return dp[i][C] = skip;
        int take = val[i] + knap(i+1, wt, val, C-wt[i],dp);
        return dp[i][C] = Math.max(skip,take);
    }
    public static void main(String[] args) 
    {
        int[] val = {5,3,9,16};
        int[] wt={1,2,8,10};
        int C = 8;
        int[][] dp=new int[val.length][C+1];
        System.out.println(knap(0, wt, val, C,dp));
    }
}
