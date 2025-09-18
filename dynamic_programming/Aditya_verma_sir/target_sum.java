package dynamic_programming.Aditya_verma_sir;

// SAME AS COUNT THE SUBSETS WITH GIVEN DIFFERENCE

/*You are given an integer array nums and an integer target.
You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target. */

/*Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3 */

public class target_sum  // count subset with given diff
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
