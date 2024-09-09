// 70. Climbing Stairs

/*You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? */

/*Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps */

package dynamic_programming;
import java.util.*;
public class climbing_Stairs 
{
    public static int stair(int n,int[] dp)
    {
        if(dp[n]!=0) return dp[n];
        return dp[n] = stair(n-1,dp)+stair(n-2,dp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        dp[0]=0; dp[1]=1; dp[2]=2;
        System.out.println(stair(n,dp));

    }
}
