package dynamic_programming.Aditya_verma_sir;

import java.util.*;

// knap sack variation 
public class Min_diff_subset_partition 
{
    public static void helper(int[] arr,int sum,boolean[][] dp) // T.C -- O(N*SUM)
    {
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0] = true;
        }
        for(int j=1;j<dp[0].length;j++)
        {
            dp[0][j] = false;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                boolean skip = dp[i-1][j];
                if(arr[i-1]<=j)
                {
                    boolean take = dp[i-1][j-arr[i-1]];
                    dp[i][j] = take || skip;
                }
                else
                    dp[i][j] = skip;
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] a={1, 6, 11, 6};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        boolean[][] dp = new boolean[a.length+1][sum+1];
        helper(a, sum, dp);
        List<Integer> al= new ArrayList<>();
        for(int j=0;j<=sum/2;j++)         // range of the S1
        {
            if(dp[dp.length-1][j]==true)
            {
                al.add(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++)
        {
            min = Math.min(sum - (2*al.get(i)),min);
        }
        System.out.println(min);
    }
}
