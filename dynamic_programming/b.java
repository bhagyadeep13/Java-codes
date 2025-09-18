package dynamic_programming;

import java.util.Scanner;

public class b {

    // Method to print all permutations of the string
    public static int helper(int[] a,int n,int[] dp) 
    {
        if(n<=0) return 0;
        if(dp[n]!=0) return dp[n];
        int take = a[n-1] + helper(a, n-2,dp);
        int skip = helper(a, n-1,dp);
        return dp[n] = Math.max(take,skip);
    }   
    public static void main(String[] args) 
    {
        int[] a={1,2,3,1};
        int[] dp = new int[a.length+1];
        System.out.println(helper(a, a.length,dp));
    }
}
