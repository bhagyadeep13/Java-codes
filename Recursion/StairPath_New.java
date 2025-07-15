package Recursion;

public class StairPath_New 
{
    public static int helper(int n,int[] dp)
    {
        if(n<=2) return dp[n] = n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = helper(n-1,dp)+helper(n-2,dp);
    } 
    public static void main(String[] args) 
    {
        int n = 5;
        int[] dp = new int[n+1];
        System.out.println(helper(n,dp));
    }
}
