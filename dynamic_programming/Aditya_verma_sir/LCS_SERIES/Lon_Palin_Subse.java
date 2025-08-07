package dynamic_programming.Aditya_verma_sir.LCS_SERIES;

public class Lon_Palin_Subse 
{
    // similar to LCS 
    // Calculate Len of Longest Palindromic Subsequence
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
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) 
    {
        String s1="bbbab";
        
        StringBuilder s2= new StringBuilder(s1);
        s2.reverse();
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int val = LCSTabu(dp, s1, s2.toString(), s1.length(), s2.length());
        System.out.println(val);
    }
}
