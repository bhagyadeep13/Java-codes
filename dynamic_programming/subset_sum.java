package dynamic_programming;
import java.util.*;
public class subset_sum 
{

    // knapsack related problem
    public static boolean subsetsum(int[] a,int n,int t) // T.C -- O(POW(2,N))
    {
        if(t==0) return true;
        if(n<0) return false;
        if(a[n]<=t)
        {
            boolean skip = subsetsum(a,n-1,t);
            boolean take = subsetsum(a, n-1, t-a[n]);
            return skip || take;
        }
        else
        {
            return subsetsum(a,n-1,t);
        }
    }
    public static boolean helperTabu(int[] arr,int sum,boolean[][] dp) // this code works only for +ve integers 
    {
        int n = arr.length;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0)
                {
                    dp[i][j] = false;
                }
                else
                if(j==0)
                {
                    dp[i][j]= true;
                }
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                boolean skip = dp[i-1][j];
                if(arr[i-1]<=j)
                {
                    boolean take = dp[i-1][j-arr[i-1]];
                    dp[i][j] = skip || take;
                }
                else
                    dp[i][j] = skip;
            }
        }
        return dp[n][sum];
    }

    public static boolean subsetsumDP(int[] a,int n,int t,Boolean[][] dp) // T.C -- O(N*T);
    {
        if(t==0) return true;
        if(n<0) return false;
        if(dp[n][t]!=null) return dp[n][t];
        if(a[n]<=t)
        {
            boolean skip = subsetsum(a,n-1,t);
            boolean take = subsetsum(a, n-1, t-a[n]);
            return dp[n][t] = skip || take;
        }
        else
        {
            return dp[n][t] = subsetsum(a,n-1,t);
        }
    }
    public static void main(String[] args) 
    {
        int[] a={0,8,3,2,4};
        int t=11;
        System.out.println(subsetsum(a, a.length-1, t));

        // i from '0' to 'n-1'
        // t from 't' to '0'
        Boolean[][] dp = new Boolean[a.length][t+1];
        System.out.println(subsetsumDP(a,a.length-1,t,dp));

        boolean[][] dp1 = new boolean[a.length+1][t+1];
        System.out.println(helperTabu(a, t, dp1));
        
    }
}
