package dynamic_programming.Aditya_verma_sir.LCS_SERIES;

/*Given string str, find the length of the longest repeating subsequence such that it can be found twice in the given string.
The two identified subsequences A and B can use the same ith character from string s if and only if that ith 
character has different indices in A and B. For example, A = "xax" and B = "xax" 
then the index of the first "x" must be different in the original string for A and B. */

/*Input: s = "axxzxy"
Output: 2 */
public class Lon_Repeat_Subseq 
{
    //
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
                if(s1.charAt(i-1)==s2.charAt(j-1) && i!=j) // code variation here 
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
        String s = "AABEBCDD";

        // calculate the LCS OF 's' and 's' with one extra condition (i!=j)

        int[][] dp = new int[s.length()+1][s.length()+1];
        System.out.println(LCSTabu(dp, s, s, s.length(), s.length()));
    }
}
