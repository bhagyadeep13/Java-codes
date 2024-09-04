
// 2640. Find the Score of All Prefixes of an Array

// We define the conversion array conversion of an array arr as follows:
/*conversion[i] = arr[i] + max(arr[0..i]) where max(arr[0..i]) is the maximum value of arr[j] over 0 <= j <= i.
We also define the score of an array arr as the sum of the values of the conversion array of arr.

Given a 0-indexed integer array nums of length n, return an array ans of length n where ans[i] is the score of the prefix nums[0..i].*/

package PrefixSum;
import java.util.*;
public class ScoreOf_prefixes_array 
{
    static int max;
    public static long cover(int[] a,int a1)
    {
        max=Math.max(max,a[a1]);
        return max+a[a1];
    }
    public static long[] findPrefixScore(int[] nums) 
    {
        max=Integer.MIN_VALUE;
        long[] a=new long[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=(long)cover(nums,i);
        }
        for(int i=1;i<a.length;i++)
        {
            a[i]=a[i-1]+a[i];
        }
        return a;
    }
    public static void main(String[] args) 
    {
        int[] a={2,3,7,5,10};
        long[] ans=findPrefixScore(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
