package dynamic_programming;
import java.util.*;
public class Edit_distance 
{
    public static int helper(String s1,String s2,int n,int m)
    {
        if(n==0) return m; // if(n==0) we need m insertions
        if(m==0) return n; // if(m==0) we need n deletions
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            return helper(s1, s2, n-1, m-1);
        }
        else
        {
            int del = helper(s1, s2, n-1, m);
            int ins = helper(s1, s2, n, m-1);
            int rep = helper(s1, s2, n-1, m-1);
            return 1+Math.min(del,Math.min(ins,rep));
        }
    }
    public static int helper2(String s1,String s2,int n,int m,int[][] dp)
    {
        if(n==0) return m;
        if(m==0) return n;
        if(dp[n-1][m-1]!=0) return dp[n-1][m-1];
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            return dp[n-1][m-1] = helper2(s1, s2, n-1, m-1,dp);
        }
        else
        {
            int del = helper2(s1, s2, n-1, m,dp);
            int ins = helper2(s1, s2, n, m-1,dp);
            int rep = helper2(s1, s2, n-1, m-1,dp);
            return dp[n-1][m-1] = 1+Math.min(del,Math.min(ins,rep));
        }
    }
    public static void main(String[] args) {

        String s1 = "horse";
        String s2 = "ros";

        System.out.println(helper(s1, s2, s1.length(), s2.length()));

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        System.out.println(helper2(s1, s2, s1.length(), s2.length(), dp));
    }
}
