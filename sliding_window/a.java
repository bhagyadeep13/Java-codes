package sliding_window;
import java.util.*;
public class a 
{
    public static boolean istrue(int[] nums,int i,int j,int t)
    {
        int count=0;
        boolean c1=false,c2=false,c3=false;
        if(nums[i]%2==0) c1=true;
        for(int k=i;k<j;k++)
        {
            if(nums[k]%2!=nums[k+1]%2)
            count++;
        }

        if(count==(j-i)) c2=true;
        count=0;
        for(int k=i;k<=j;k++)
        {
            if(nums[k]<=t)
            count++;
        }
        if(count==(j-i+1)) c3=true;
        System.out.println(c1+" "+c2+" "+c3);
        return c1 && c2 && c3;
    }
    public static void longestAlternatingSubarray(int[] nums, int t) 
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(istrue(nums,i,j,t))
                max=Math.max(max,j-i+1);
            }
        } 
        System.out.println(max);
    }
    public static void main(String[] args) 
    {
        int[] a={3,2,5,4};
        longestAlternatingSubarray(a,5);
    }
}
