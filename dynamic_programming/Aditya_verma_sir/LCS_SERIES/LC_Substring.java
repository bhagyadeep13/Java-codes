package dynamic_programming.Aditya_verma_sir.LCS_SERIES;

public class LC_Substring 
{
    // similar to LC SUBSEQUENCE
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
                    dp[i][j] = 0;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++) // return max value in dp
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j]+" ");
                max=Math.max(max,dp[i][j]);
            }
            System.out.println();
        }
        return max;
    }
    public static void main(String[] args) 
    {
        String s1 = "abcde";
        String s2 = "abdk";

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        System.out.println(LCSTabu(dp, s1, s2, s1.length(), s2.length()));
    }
}
