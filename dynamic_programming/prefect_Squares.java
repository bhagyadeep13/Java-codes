package dynamic_programming;
import java.util.*;
public class prefect_Squares 
{
    public static boolean isPerfect(int n)
    {
        int sqrt=(int)(Math.sqrt(n));
        if((sqrt*sqrt)==n) return true;
        else return false; 
    }
    
    public static int perfect(int n)  // TIME COMPLEXITY -- O(POW(N,N))
    {
        if(isPerfect(n)) return 1;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n/2;i++)
        {
            int count = perfect(i) + perfect(n-i);
            min=Math.min(count,min);
        }
        return min;
    }

    public static int perfect2(int n,int[] dp) // TIME COMPLEXITY -- O(LESS THAN N^2)
    {
        if(isPerfect(n)) return 1;
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=1;i<=n/2;i++)
        {
            if(dp[i]!=-1 && dp[n-i]==-1) 
            {
                dp[n-i]=perfect2(n-i,dp);
                count=dp[i]+dp[n-i];
            }
            else
            if(dp[i]==-1 && dp[n-i]!=-1)
            {
                dp[i]=perfect2(i,dp);
                count=dp[n-i]+dp[i];
            }
            else
            if(dp[i]!=-1 && dp[n-i]!=-1)
            {
                 count=dp[i]+dp[n-i];
            }
            else
            {
                dp[i]=perfect2(i,dp);
                dp[n-i]=perfect2(n-i,dp);
                 count=dp[i]+dp[n-i];
            }
            min=Math.min(count,min);
        }
        return min;
    }

    public static int perfect3(int n,int[] dp)   // TIME COMPLEXITY -- O(N*(SQRT(N)))
    {
        if(isPerfect(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            int count = perfect3(i*i,dp) + perfect3(n-i*i,dp);
            min=Math.min(count,min);
        }
        return dp[n] = min;
    }

    public static int perfect4(int n)   // TABULATION {TC -- O(N*SQRT(N))} 
    {
        int[] dp=new int[n+1];
        if(isPerfect(n)) return 1;
        for(int i=1;i<=n;i++)
        {
            if(isPerfect(i)) dp[i]=1;
            else
            {
                int min=Integer.MAX_VALUE;
                for(int j=1;j*j<=i;j++)
                {
                    int count = dp[j*j] + dp[i-j*j];
                    min=Math.min(count,min);
                }
                dp[i]=min;
            }
        }
        return dp[dp.length-1];
    }
    public static void main(String[] args) 
    {
        int n=34;
        System.out.println(perfect(n));

        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(perfect2(n, dp));

        int[] dp1=new int[n+1];
        Arrays.fill(dp1,-1);
        System.out.println(perfect3(n, dp1));

        System.out.println(perfect4(n));

    }
}
