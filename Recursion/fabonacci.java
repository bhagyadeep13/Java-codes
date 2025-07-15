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
    static int fabo(int n)
    {
        if(n<=1) return n;
        return fabo(n-1)+fabo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp = new int[n+1];
        System.out.println(faboDP(n,dp));

        System.out.println(fabo(n));
    }
}
