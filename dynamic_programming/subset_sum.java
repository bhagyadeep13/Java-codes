package dynamic_programming;
import java.util.*;
public class subset_sum 
{
    public static boolean subset(int i,int t,int[] nums)// TIME COMPLEXITY -- O(POW(2,N))
    {
        if(i==nums.length)
        {
            if(t==0) return true;
            else return false;
        }
        boolean skip = subset(i+1, t, nums);
        if(t-nums[i]<0) return skip;      // Only for +ve numbers in array
        boolean take= subset(i+1, t-nums[i], nums);
        return skip || take;
    }

    public static boolean subset1(int i,int t,int[] nums,int[][] dp)// TIME COMPLEXITY -- O(POW(2,N))
    {
        if(i==nums.length)
        {
            if(t==0) return true;
            else return false;
        }
        if(dp[i][t]!=-1) 
        {
            return (dp[i][t]==1);
        }
        boolean ans= false;
        boolean skip = subset1(i+1, t, nums,dp);
        if(t-nums[i]<0) ans=skip;
        else
        {
            boolean take = subset1(i+1, t-nums[i], nums,dp);
            ans = take || skip;
        }
        if(ans==true) dp[i][t] = 1;
        else dp[i][t] = 0;
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] a={0,8,-1,2,4};
        int t= 7;
        System.out.println(subset(0, t, a));

        // i from '0' to 'n-1'
        // t from 't' to '0'
        int[][] b=new int[a.length][t+1];
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                b[i][j]=-1;
            }
        }
        System.out.println(subset1(0, t, a, b));
        
    }
}
