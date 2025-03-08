package dynamic_programming;
import java.util.*;
public class a 
{
    public static int helper(int i,int[] wt,int[] val,int C,int[][] dp)
    {
        if(i==wt.length) return 0;
        int skip = helper(i+1, wt, val, C,dp);
        if(wt[i]>C)  return dp[i][C] = skip;
        int take = val[i]+ helper(i+1, wt, val, C-wt[i],dp);
        return dp[i][C] = Math.max(skip,take);
    }
    public static void main(String[] args) {
        int[] val = {5,3,9,16};
        int[] wt={1,2,8,10};
        int C = 8;
        int[][] dp=new int[wt.length][C+1];
        System.out.println(helper(0, wt, val, C,dp));

    }
}
