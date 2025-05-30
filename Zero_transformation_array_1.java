/*3355. Zero Array Transformation I

You are given an integer array nums of length n and a 2D array queries, where queries[i] = [li, ri].
For each queries[i]:
Select a subset of indices within the range [li, ri] in nums.
Decrement the values at the selected indices by 1.
A Zero Array is an array where all elements are equal to 0.

Return true if it is possible to transform nums into a Zero Array after processing all the queries sequentially, otherwise return false. */

import java.util.*;
public class Zero_transformation_array_1 
{
  public static void main(String[] args) 
  {
    int[] nums={1,0,1};          // T.C -- O(q.length+nums..length)
    int[][] q={{0,2}};          // S.C -- O(N+N)

    int[] diff=new int[nums.length]; // diff array is made
        for(int i=0;i<q.length;i++)
        {
            int st=q[i][0];
            int end=q[i][1];
            diff[st]++;
            if(end+1<nums.length)
            {
                diff[end+1]--;
            }
        }
        int[] pre=new int[nums.length]; // prefix sum array of diff array
        pre[0]=diff[0];         // it store number of operations we have to 
        for(int i=1;i<diff.length;i++) // to reduce the value at this idx to zero
        {
            pre[i]=pre[i-1]+diff[i];
        }
        for(int i=0;i<nums.length;i++) 
        {
            if(nums[i]>pre[i])        // if(nums[i]>pre[i]) return false
            {
              System.out.println(false);
              return;
            }
        }
        System.out.println(true);
  }
}
