package dynamic_programming.Aditya_verma_sir.LCS_SERIES;

public class Min_del_insert 
{
    // similar to LCS 
    // Minimum number of insertions and deletions to convert string "a" to string "b"
    public static int helper(String s1,String s2,int n,int m,int[][] dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0] = 0;
        }
        for(int j=1;j<dp[0].length;j++)
        {
            dp[0][j] = 0;
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
        String s1="heap"; // a
        String s2="pea"; // b

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int val = helper(s1,s2,s1.length(),s2.length(),dp);
        int delete = s1.length()-val;
        int insert = s2.length() - val;
        System.out.println(delete+" "+insert);
    }
}
