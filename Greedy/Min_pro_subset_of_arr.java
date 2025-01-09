package Greedy;
import java.util.*;
public class Min_pro_subset_of_arr 
{
    public static long helper(int[] nums)
    {
        Arrays.sort(nums);
        int count=0;
        long pro =1;
        boolean flag=false;
        int i=0;
        while(i<nums.length && nums[i]<0)
        {
            count++;
            i++;
            flag=true;
        }
        if(flag==false) return nums[0];
        else
        if(count%2==0)
        {
            for(int j=1;j<nums.length;j++)
            {
                pro=pro*nums[j];
            }
            return pro;
        }
        else
        {
            for(int j=0;j<nums.length;j++)
            {
                pro=pro*nums[j];
            }
            return pro;
        }
    }
    public static void main(String[] args) 
    {
        int[] nums={-1,-2,-3,-4};
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) 
            {
                System.out.println(0);
                return;
            }
        }
        System.out.println(helper(nums));
    }
}
