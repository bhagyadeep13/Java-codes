package Recursion;
import java.util.*;
public class fabonacci 
{
    static int faboDP(int n,int[] dp)
    {
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = faboDP(n-1,dp)+faboDP(n-2,dp);
    }
    static int stair(int n,int[] dp)
    {
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = stair(n-1,dp)+stair(n-2,dp)+stair(n-3,dp);
    }
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp = new int[n+1];
        System.out.println(faboDP(n,dp));*/

        int n=4;
        int[] dp1 = new int[n+1];
        System.out.println(stair(n, dp1));
    }
}
