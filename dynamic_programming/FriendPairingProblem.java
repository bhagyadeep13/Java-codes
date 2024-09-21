package dynamic_programming;
import java.util.*;
public class FriendPairingProblem 
{
    public static int helper(int n,int[] dp) //(RECURSION + MEMOIZATION)TIME COMPLEXITY -- O(N)
    {
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = helper(n-1,dp) + (n-1)*helper(n-2,dp);
    }
    public static int helper2(int n)   // TIME COMPLEXITY -- O(N)
    {
        if(n<=2) return n;
        return helper2(n-1) + (n-1)*helper2(n-2);
    }

    public static int helper3(int n)  // TABULATION (TIME COMPLEXITY -- O(N))
    {
        int[] dp=new int[n+1];
        dp[0]=0; 
        dp[1]=1; 
        if(n>1) dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i] = dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(helper(n,dp));

        System.out.println(helper2(n));

        System.out.println(helper3(n));
    }
}
