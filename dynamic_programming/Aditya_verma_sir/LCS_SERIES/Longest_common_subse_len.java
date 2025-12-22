package dynamic_programming.Aditya_verma_sir.LCS_SERIES;

public class Longest_common_subse_len 
{
    public static int helper(int n,int m,String s1,String s2,int[][] dp)
    {
        if(n==0 || m==0) return 0;
        if(dp[n-1][m-1]!=0) return dp[n-1][m-1];
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            return dp[n-1][m-1] = 1+helper(n-1, m-1, s1,s2,dp);
        }
        else
        {
            return dp[n-1][m-1] = Math.max(helper(n-1, m, s1, s2,dp),helper(n, m-1, s1, s2,dp));
        }
    }
    public static int helper2(int n,int m,String s1,String s2)
    {
        if(n==0 || m==0) return 0;
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            return 1 + helper2(n-1, m-1, s1, s2);
        }
        else
        {
            return Math.max(helper2(n-1, m, s1, s2),helper2(n, m-1, s1, s2));
        }
    }
    // TABLULATION
    public static int LCSTabu(int[][] dp,String s1,String s2,int n,int m)
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0 || j==0)
                dp[i][j] = 0;
            }
        }
        for(int i=1;i<dp.length;i++) // n -> i and m -> j
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) 
    {
        String s1 = "abc";
        String s2 = "ahbgdc";

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        System.out.println(helper(s1.length(), s2.length(), s1, s2,dp));

        int[][] dp1 = new int[s1.length()+1][s2.length()+1];
        System.out.println(LCSTabu(dp1, s1, s2, s1.length(), s2.length()));

        System.out.println(helper2(s1.length(), s2.length(), s1, s2));
    }
}
