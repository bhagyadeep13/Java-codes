package dynamic_programming.Aditya_verma_sir.LCS_SERIES;

public class Print_LCS 
{
    static StringBuilder ans = new StringBuilder("");
    public static void helper(String s1,String s2,int n,int m,int[][] dp)
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
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int i=n,j=m;
        while(i>0 && j>0)  // PRINT THE LCS 
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
                    j--;
                }
                else 
                    i--;
            }
        }
        ans.reverse();
        System.out.println(ans);
    }
    public static void main(String[] args) 
    {
        String s1 = "delete";
        String s2 = "leet";

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        helper(s1, s2, s1.length(), s2.length(), dp);
    }
}
