package Recursion;
import java.util.*;
public class Factorial 
{
    static int fact(int n)
    {
        if(n==1 || n==0) return 1;
        return n*fact(n-1);
    }
    static int factDP(int n,int[] dp)
    {
        if(n<=1) return 1;
        if(dp[n]!=0) return dp[n];
        return dp[n] = n*fact(n-1);
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] dp = new int[n+1];
    System.out.println(factDP(n,dp));

    System.out.println(fact(n));
   }
}
