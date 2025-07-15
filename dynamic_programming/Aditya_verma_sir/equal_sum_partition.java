package dynamic_programming.Aditya_verma_sir;

public class equal_sum_partition 
{
    // knapsack version

    // Logic -- Pehle sum nikal lo agar even h - to divide kar sakte h
                // else return kardo

    // Now problem will come ki array me subset find karo jiska sum TotalSum/2 ke equal h ki nhi;
    // That is Subset sum problem
    public static boolean helper(int[] arr,int sum,boolean[][] dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0] = true;
        }
        for(int j=1;j<dp[0].length;j++)
        {
            dp[0][j] = false;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                boolean skip = dp[i-1][j];
                if(arr[i-1]<=j)
                {
                    boolean take = dp[i-1][j-arr[i-1]];
                    dp[i][j] = take || skip;
                }
                else
                    dp[i][j] = skip;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) 
    {
        int[] a={1,5,11,5};
        int sum1=0;
        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        if(sum1%2!=0) 
        {
            System.out.println(false);
        }
        else
        {
            int newSum = sum1/2;
            boolean[][] dp = new boolean[a.length+1][newSum+1];
            System.out.println(helper(a, newSum, dp));
        }
    }
}
