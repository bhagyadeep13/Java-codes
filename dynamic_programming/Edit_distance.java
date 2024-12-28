// 72. Edit Distance

/*Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
You have the following three operations permitted on a word:
Insert a character
Delete a character
Replace a character */

/*Input: word1 = "horse", word2 = "ros"
Output: 3 */
package dynamic_programming;
import java.util.*;
public class Edit_distance 
{
    public static int helper(int i,int j,String s1,String s2)  // RECURSION
    {                                           // T.C -- O(POW(3,N))
        if(i==-1) return j+1;                   // S.C - O(M*N)
        if(j==-1) return i+1;
        if(s1.charAt(i)==s2.charAt(j))
        {
            return helper(i-1, j-1, s1, s2);
        }
        else
        {
            int del = helper(i-1, j, s1, s2);
            int ins = helper(i, j-1, s1, s2);
            int rep = helper(i-1, j-1, s1, s2);
            return 1+Math.min(del,Math.min(ins,rep));
        }
    }

    public static int helper2(int i,int j,String s1,String s2,int[][] dp)
    {                                            // RECURSION + MEMOIZATION
        if(i==-1) return j+1;                   // T.C -- O(M*N)
        if(j==-1) return i+1;                   // S.C -- O(M*N)
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j] = helper2(i-1, j-1, s1, s2,dp);
        }
        else
        {
            int del = helper2(i-1, j, s1, s2,dp);
            int ins = helper2(i, j-1, s1, s2,dp);
            int rep = helper2(i-1, j-1, s1, s2,dp);
            return dp[i][j] = 1+Math.min(del,Math.min(ins,rep));
        }
    }
    public static void main(String[] args) 
    {
        String s1="horse";
        String s2="ros";
        int m=s1.length();
        int n=s2.length();
        System.out.println(helper(m-1,n-1, s1, s2));

        int[][] dp=new int[m][n];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(helper2(m-1, n-1, s1, s2, dp));
    }
}
