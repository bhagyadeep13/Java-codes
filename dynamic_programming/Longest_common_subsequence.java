// 1143. Longest Common Subsequence

/*Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings. */

/*Input: text1 = "abcde", text2 = "ace" 
Output: 3 */

package dynamic_programming;
import java.util.*;
public class Longest_common_subsequence 
{
    public static int helper(int m,String s1,int n,String s2,int[][] dp)
    {                                                   // recusion + memoization
        if(m<0 || n<0) return 0;                //  T.C -- O(M*N)
        if(dp[m][n]!=-1) return dp[m][n];       // S.C -- O(m*n)
        if(s1.charAt(m)==s2.charAt(n))
        {
            return dp[m][n] = 1+helper(m-1,s1,n-1,s2,dp);
        }
        else
        {
            int one = helper(m, s1, n-1, s2,dp);
            int two = helper(m-1,s1,n,s2,dp);
            return dp[m][n] = Math.max(one,two);
        }
    }
    public static int helper3(int m,String s1,int n,String s2,int[][] dp1)
    {
        if(m==0 || n==0) return 0;
        if(dp1[m-1][n-1]!=0) return dp1[m-1][n-1];
        if(s1.charAt(m-1) == s2.charAt(n-1))
        {
            return dp1[m-1][n-1] = 1+helper3(m-1, s1, n-1, s2,dp1);
        }
        else 
        {
            int left = helper3(m-1, s1, n, s2,dp1);
            int right = helper3(m, s1, n-1, s2,dp1);
            return dp1[m-1][n-1] = Math.max(left,right);
        }
    }

    public static int longestCommonSubsequence(String s1, String s2) 
    {                                                  // TABULALTION 
        int a= s1.length();                             //  T.C -- O(M*N)
        int b= s2.length();                             // S.C -- O(m*n)
        int[][] dp=new int[a][b];
        for(int m=0;m<dp.length;m++)
        {
            for(int n=0;n<dp[0].length;n++)
            {
                int p = (m>=1 && n>=1) ? dp[m-1][n-1] : 0;
                int q = (n>=1) ? dp[m][n-1] : 0;
                int r = (m>=1) ? dp[m-1][n] : 0;
                if(s1.charAt(m)==s2.charAt(n))
                {
                    
                    dp[m][n] = 1+p;
                }
                else
                {
                    dp[m][n] = Math.max(q,r);
                }
            }
        }
        return dp[a][b];
    }
    public static void main(String[] args) 
    {
        String s1="abcde";
        String s2="fabgdk";

        // m -- m-1 to 0 -- m
        // n -- n-1 to 0 -- n

        int[][] dp=new int[s1.length()][s2.length()];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(helper(s1.length()-1, s1,s2.length()-1,s2,dp));

        // Tabulation
        //System.out.println(longestCommonSubsequence(s1, s2));

        int[][] dp1 = new int[s1.length()+1][s2.length()+1];
        System.out.println(helper3(s1.length(), s1, s2.length(), s2, dp1));

    }
}
