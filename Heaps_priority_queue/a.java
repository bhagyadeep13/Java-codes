package Heaps_priority_queue;
import java.util.*;
public class a 
{
    static int MOD = 1_000_000_007;
    public static int path(int i,int j,int curr,int t,int[][] g,int m,int n)
    {
        if(i>=m || j>=n)
        {
            return 0;
        }
        curr= curr^g[i][j];
        if(i==m-1 && j==n-1) 
        {
            if(curr==t) return 1;
            else return 0;
        }
        int down = path(i+1,j,curr,t,g,m,n);
        int right = path(i,j+1,curr,t,g,m,n);
        return (right+down) % MOD;
    }
    public static int path(int curr,int t,int[][] g,int m,int n,int[][] dp)
    {
        if(m<=0 || n<=0)
        {
            return 0;
        }
        curr= curr^g[m-1][n-1];
        if(m==1 && n==1) 
        {
            if(curr==t) return 1;
            else return 0;
        }
        if(dp[m-1][n-1]!=0) return dp[m-1][n-1];
        int down = path(curr,t,g,m-1,n,dp);
        int right = path(curr,t,g,m,n-1,dp);
        return dp[m-1][n-1] = (right+down) % MOD;
    }
    public static void main(String[] args) 
    {
        int[][] a={{2, 1, 5}, {7, 10, 0}, {12, 6, 4}};
        int k= 11;
        int[][] dp=new int[a.length][a[0].length];
        System.out.println(path(0,0,0,11,a,a.length,a[0].length));
        System.out.println(path(0, k, a, a.length, a[0].length,dp));
    }
}
