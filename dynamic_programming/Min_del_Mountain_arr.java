// 1671. Minimum Number of Removals to Make Mountain Array

/*You may recall that an array arr is a mountain array if and only if arr.length >= 3
There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given an integer array nums​​​, return the minimum number of elements to remove to make nums​​​ a mountain array. */

/*Input: nums = [1,3,1]
Output: 0 */

package dynamic_programming;
import java.util.*;
public class Min_del_Mountain_arr 
{
    public static int helper(int[] a)
    {
        int n=a.length;
        int max=Integer.MIN_VALUE;
        int idx=0;
        int[] dp = new int[n];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[i])
                {
                    dp[i]=Math.max(dp[i],dp[j]);
                }
            }
            dp[i]=dp[i]+1;
        }
        int[] dp2=new int[n];
        for(int i=dp2.length-1;i>=0;i--)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                if(a[j]<a[i])
                {
                    dp2[i]=Math.max(dp2[i],dp2[j]);
                }
            }
            dp2[i]=dp2[i]+1;
        }
        for(int i=0;i<n;i++)
        {
            if(dp[i]>1 && dp2[i]>1)
            max=Math.max(((dp[i]+dp2[i])-1),max);
        }
        return n-max;
    }
    public static void main(String[] args) 
    {
        int[] a={9,8,1,7,6,5,4,3,2,1};
        System.out.println(helper(a));
    }
}
