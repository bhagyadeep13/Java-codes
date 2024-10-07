package dynamic_programming;
import java.util.*;
public class uniquePaths 
{
    public static int path1(int m,int n)  // TIME COMPLEXITY -- O(POW(2,M)*POW(2,N))
    {
        if(m==1 || n==1) return 1;
        int rightways=path1(m,n-1);
        int downways=path1(m-1,n);
        return rightways+downways;
    }

    public  static int path2(int m,int n,int[][] dp) // TIME COMPLEXITY -- O(N*M)
    {
        if(m==1 || n==1) return 1;
        if(dp[m-1][n-1]!=0) return dp[m-1][n-1];
        int rightways=path2(m,n-1,dp);
        int downways=path2(m-1,n,dp);
        return dp[m-1][n-1] = rightways+downways;
    }

    public static int path3(int m,int n,int i,int j)
    {
        if(i==m-1 || j==n-1) return 1;
        return path3(m,n,i+1,j)+path3(m,n,i,j+1);
    }

    public static int helper3(int m,int n)   // TABULATION -- O(M*N)
    {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0) dp[i][j]=1;
                else dp[i][j]= dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) 
    {
        int m=3;
        int n=3;
        System.out.println(path1(m,n));   // RECURSION 

        System.out.println(path3(m, n, 0, 0));
        
        int[][] dp=new int[m][n]; 
        System.out.println(path2(m,n,dp));  // RECURSION + MEMOIZATION

        System.out.println(helper3(m, n));
    }
}
