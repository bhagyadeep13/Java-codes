package dynamic_programming.Aditya_verma_sir;

public class Count_subset_Given_diff 
{
    public static int helper(int[] arr,int sum,int[][] dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0] = 1;
        }
        for(int j=1;j<dp[0].length;j++)
        {
            dp[0][j] = 0;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                int skip = dp[i-1][j];
                if(arr[i-1]<=j)
                {
                    int take = dp[i-1][j-arr[i-1]];
                    dp[i][j] = skip + take;
                }
                else
                    dp[i][j] = skip;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) 
    {
        int[] a={1,1,1,1,1};
        int diff = 3;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        if((diff+sum)%2!=0 || diff+sum<0) // ( diff+sum cannot be negative or odd )
        {
            System.out.println(0);
            return;
        }
        int sum_of_S1 = (diff + sum)/2;
        int[][] dp = new int[a.length+1][sum_of_S1+1];
        System.out.println(helper(a, sum_of_S1, dp));
    }
}
