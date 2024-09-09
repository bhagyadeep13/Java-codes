package dynamic_programming;
import java.util.*;
public class Fibonacci 
{
    static int[] dp;         
       
    public static int fibo(int n)   // TIME COMPLEXITY - O(N) -- MEMOIZATION AND RECURSION
    {
        if(n==0 || n==1) return n;
        if(dp[n]!=0) return dp[n];
        dp[n]=fibo(n-1)+fibo(n-2);
        return dp[n];
    }


    public static void fibo2(int n)    // TIME COMPLEXITY - O(N) -- TABULATION METHOD
    {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        for(int i=0;i<dp.length;i++)
        {
            System.out.print(dp[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dp=new int[n+1];
        System.out.println(fibo(n));
        fibo2(n);
    }
}
