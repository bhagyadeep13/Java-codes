package sliding_window;
import java.util.*;
public class max_sum_subarray_size_k
{
    public static void maxsum1(int k,int[] nums)       // brute force -- O(N*k)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-k+1;i++)
        {
            sum=0;
            for(int j=i;j<=i+k-1;j++)
            {
                sum=sum+nums[j];
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
    public static void maxsum2(int k,int[] nums)   // Optimal solution -- O(N)
    {
        int n=nums.length;
        int i=0,j=k-1,sum=0,max=Integer.MIN_VALUE;
        for(int l=i;l<=j;l++)
        {
            sum=sum+nums[l];
        }
        i++;
        j++;
        max=sum;
        while(j<n)
        {
            sum=sum-nums[i-1]+nums[j];
            max=Math.max(sum,max);
            i++;
            j++;
        }
        System.out.println(max);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[] nums={1,12,-5,-6,50,3};      
        int k=sc.nextInt();
        int sum;
        maxsum1(k,nums);
        maxsum2(k,nums);
    }
}