// 1005. Maximize Sum Of Array After K Negations

/*Given an integer array nums and an integer k, modify the array in the following way:
choose an index i and replace nums[i] with -nums[i].
You should apply this process exactly k times. You may choose the same index i multiple times.
Return the largest possible sum of the array after modifying it in this way. */

/*Input: nums = [4,2,3], k = 1
Output: 5 */

package Greedy;
import java.util.*;
public class largSumAfterKNego 
{
    public static int largestSumAfterKNegations(int[] nums, int k) 
    {
        int i=0;
        int sum=0;
        Arrays.sort(nums);
        while(i<nums.length && nums[i]<0 && k>0)
        {
            nums[i]=nums[i]*(-1);
            i++;
            k--;
        }
        if(k%2!=0)
        {
            int idx=0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<min)
                {
                    idx=j;
                    min=nums[j];
                }
            }
            nums[idx]=nums[idx]*(-1);
        }
        for(int j=0;j<nums.length;j++)
        {
            sum=sum+nums[j];
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int[] nums ={4,2,3};
        int k=1;
        System.out.println(largestSumAfterKNegations(nums, k));
    }
}
