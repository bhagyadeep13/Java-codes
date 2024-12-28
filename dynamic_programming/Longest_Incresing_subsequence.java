// 300. Longest Increasing Subsequence

/*Given an integer array nums, return the length of the longest strictly increasing 
subsequence
. */

/*Input: nums = [10,9,2,5,3,7,101,18]
Output: 4 */

package dynamic_programming;
import java.util.*;
public class Longest_Incresing_subsequence 
{
    public static int helper(int[] a)
    {                                      // T.C -- O(N*N)
        int n=a.length;
        int max=Integer.MIN_VALUE;
        int[] dp=new int[n];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[i])
                {
                    dp[i]=Math.max(dp[j],dp[i]);
                }
            }
            dp[i]=dp[i]+1;
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    public static void main(String[] args) 
    {
        int[] a ={10,9,2,5,3,7,101,18};
        System.out.println(helper(a));
    }
}
