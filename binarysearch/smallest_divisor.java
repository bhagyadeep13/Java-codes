package binarysearch;
import java.util.*;
public class smallest_divisor 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        System.out.println(max);
        int st=1;
        int end=max;
        int d=1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]%mid==0)
                sum=sum+(nums[i]/mid);
                else
                sum=sum+((nums[i]/mid)+1);
            }
            if(sum<=t)
            {
                d=mid;
                end=mid-1;
            }
            else
                st=mid+1;
        }
        System.out.println(d);
    }
}
