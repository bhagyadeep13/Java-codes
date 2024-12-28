package dynamic_programming;
import java.util.*;
public class Unique_BST 
{
    public static int helper(int n)
    {
        if(n<=1) return 1;
        int[] dp=new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                dp[i] = dp[i] + dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) 
    {
        int n=3;
        System.out.println(helper(n));
    }
}
