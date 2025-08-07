package dynamic_programming.Aditya_verma_sir.LCS_SERIES;

/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some 
(can be none) of the characters without disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not). */

public class Sequence_Pattern 
{
    // we need to find String "s" is a subsequence of String "t"

    // concept 
    
    // if(LCS(s,t).equals(s)) return true
    // else false
    public static boolean helper(String s1,String s2,int n,int m,int[][] dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0 || j==0)
                dp[i][j] = 0;
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
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int val = dp[dp.length-1][dp[0].length-1];
        if(val!=s1.length()) return false;
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
                {
                    j--;
                }
            }
        }
        ans.reverse();
        if(ans.toString().equals(s1)) return true;
        else return false;
    }
    public static void main(String[] args) 
    {
        String s = "abc";
        String t = "ahbgdc";

        int[][] dp = new int[s.length()+1][t.length()+1];
        System.out.println(helper(s,t,s.length(),t.length(),dp));
    }
}
