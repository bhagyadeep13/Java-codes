package dynamic_programming.Aditya_verma_sir.LCS_SERIES;

public class a 
{
    public static int  helper(String s1,String s2,int n,int m, int[][] dp)
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
                    dp[i][j] =  1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static int helper2(int[] a,int n)
    {
        if(n==0) 
        {
            return 1;
        }
        if(a[n-1]<a[n]) return 1+helper2(a, n-1);
        else
        {
            return helper2(a,n-1);
        }
    }
    public static void main(String[] args) 
    {
        int[] a={4,10,4,3,8,9};

        System.out.println(helper2(a,a.length-1));

    }
    
}
