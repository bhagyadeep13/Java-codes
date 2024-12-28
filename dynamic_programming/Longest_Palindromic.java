package dynamic_programming;
import java.util.*;
public class Longest_Palindromic 
{
    public static int longestPalindromeSubseq(int m,StringBuilder s1,int n, StringBuilder s2) 
    {
        if(m<0 || n<0) return 0;                    
        if(s1.charAt(m)==s2.charAt(n))
        {
            return 1+longestPalindromeSubseq(m-1,s1,n-1,s2);
        }
        else
        {
            int one = longestPalindromeSubseq(m, s1, n-1, s2);
            int two = longestPalindromeSubseq(m-1,s1,n,s2);
            return Math.max(one,two);
        }
    }

    public static int longestPalindromeSubseq2(int m,StringBuilder s1,int n, StringBuilder s2,int[][] dp) 
    {
        if(m<0 || n<0) return 0; 
        if(dp[m][n]!=-1) return dp[m][n];                   
        if(s1.charAt(m)==s2.charAt(n))
        {
            return dp[m][n] = 1+longestPalindromeSubseq2(m-1,s1,n-1,s2,dp);
        }
        else
        {
            int one = longestPalindromeSubseq2(m, s1, n-1, s2,dp);
            int two = longestPalindromeSubseq2(m-1,s1,n,s2,dp);
            return dp[m][n] = Math.max(one,two);
        }
    }
    public static void main(String[] args) 
    {
        StringBuilder s=new StringBuilder("bbbab");
        StringBuilder s1=new StringBuilder("bbbab");
        s1.reverse();
        int a = s.length();
        int b = s1.length();
        System.out.println(longestPalindromeSubseq(a-1, s, b-1, s1));

        int[][] dp=new int[a][b];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(longestPalindromeSubseq2(a-1, s, b-1, s1,dp));

    }


}
