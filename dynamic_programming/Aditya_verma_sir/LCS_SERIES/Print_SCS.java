package dynamic_programming.Aditya_verma_sir.LCS_SERIES;

public class Print_SCS 
{
    public static void LCSTabu(int[][] dp,String s1,String s2,int n,int m)
    {
        StringBuilder ans = new StringBuilder("");
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
                if(dp[i][j-1]>dp[i-1][j])
                {
                    ans.append(s2.charAt(j-1));
                    j--;
                }
                else
                {
                    ans.append(s1.charAt(i-1));
                    i--;
                }
            }
        }
        while(i>0)
        {
            ans.append(s1.charAt(i-1));
            i--;
        }
        while(j>0)
        {
            ans.append(s2.charAt(j-1));
            j--;
        }
        ans.reverse();
        System.out.println(ans);
    }
    public static void main(String[] args) 
    {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int[][] dp1 = new int[s1.length()+1][s2.length()+1];
        LCSTabu(dp1, s1, s2, s1.length(), s2.length());
    }
}
