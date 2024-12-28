package dynamic_programming;
import java.util.*;
public class Coin_change 
{
    public static long helper(int i,int[] c, int a,long[][] dp) 
    {
        if(i==c.length)
        {
            if(a==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][a]!=-1) return dp[i][a];
        long skip = helper(i+1,c,a,dp);
        if(c[i]>a) return dp[i][a] = skip;
        long take = 1 + helper(i,c,a-c[i],dp);
        return dp[i][a] = Math.min(skip,take);
    }
    public static void main(String[] args) 
    {
        int[] a = {1,2,5};
        int am = 11;
        long[][] dp=new long[a.length][am+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j] =-1;
            }
        }
        int val = (int)helper(0, a, am,dp);
        if(val==Integer.MAX_VALUE)
        System.out.println(-1);
        else
        {
            System.out.println(val);
        }
    }
}
