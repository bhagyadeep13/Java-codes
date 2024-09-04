// 209. Minimum Size Subarray Sum

/*Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead */

/*Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2*/


package sliding_window;
import java.util.*;
public class min_size_subarraySum 
{
    public static int min_sum(int[] nums,int t)  // variable sliding window
    {
        int min=Integer.MAX_VALUE;
        int i=0,j=0;
        int sum=0;
        while(sum<t)
        {
            sum=sum+nums[j];
            j++;
        }
        j--;
        while(i<nums.length && j<nums.length)
        {
            int len=j-i+1;
            if(sum>=t) min=Math.min(min,len);
            sum=sum-nums[i];
            i++;
            j++;
            while(j<nums.length && sum<t)
            {
                sum=sum+nums[j];
                j++;
            }
            j--;
        }
        return min;

    }
    public static void main(String[] args) 
    {
        int[] a={1,4,4};
        System.out.println(min_sum(a, 4));
    }
}
