package dynamic_programming.Aditya_verma_sir.LCS_SERIES;
import java.util.*;
public class a 
{
    public static int  helper(String s1,String s2,int n,int m,int[][] dp)
    {
        if(n==0 || m==0) return 0;
        if(dp[n-1][m-1]!=0) return dp[n-1][m-1];
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            return dp[n-1][m-1] = 1+helper(s1, s2, n-1, m-1,dp);
        }
        else
        {
            return dp[n-1][m-1] = Math.max(helper(s1, s2, n-1, m,dp),helper(s1, s2, n, m-1,dp));
        }
    }
    public static int helper2(String s1,String s2,int n,int m,int[][] dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j] = 0;
                }
            }
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        StringBuilder ans = new StringBuilder("");
        int i=n,j=m;
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                ans.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else
            {
                if(dp[i-1][j]>dp[i][j-1])
                {
                    i--;
                }
                else
                j--;
            }
        }
        ans.reverse();
        System.out.println(ans);
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) 
    {
        String s1="mbadm";
        StringBuilder s3 = new StringBuilder(s1);
        s3.reverse();
        String s2 = s3.toString();
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        System.out.println(helper(s1, s2, s1.length(), s2.length(),dp));

        int total = s1.length()+s2.length();
        int lcs = helper2(s1, s2, s1.length(), s2.length(), dp);
        int del = s1.length()-lcs; // insertion bhi same honge
        System.out.println(del);
    }
    
}
