
// 238. Product of Array Except Self

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.

 
package PrefixSum;
import java.util.*;
public class Array_pro_exceptitself 
{
    public static int[] productExceptSelf(int[] nums) 
    {
        int[] pre=new int[nums.length];  // (pre) array by pre[i]=nums[i-1]*pre[i-1];
        pre[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            pre[i]=nums[i-1]*pre[i-1]; // 
        }

        int[] suff=new int[nums.length];//(suff) array by suff[i]=nums[i+1]*suff[i+1];
        pre[0]=1;
        suff[suff.length-1]=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            suff[i]=nums[i+1]*suff[i+1];
        }
        for(int i=0;i<nums.length;i++)  // then put the product of suff[i]*pre[i] in nums[i]
        {
            nums[i]=suff[i]*pre[i];
        }
        return nums;
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4};
        int[] ans=productExceptSelf(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
