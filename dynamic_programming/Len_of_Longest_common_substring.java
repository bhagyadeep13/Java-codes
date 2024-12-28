package dynamic_programming;
import java.util.*;
public class Len_of_Longest_common_substring 
{
    public static int helper(String s1,String s2)  // LCS + SOME VARIATION
    {
        int m=s1.length();
        int n=s2.length();
        int max=Integer.MIN_VALUE;
        int[][] dp=new int[m][n];
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] =0;   // THIS LINE IS CHANGED
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        String s1="abcdef";
        String s2="defagh";
        System.out.println(helper(s1, s2));
    }
}
