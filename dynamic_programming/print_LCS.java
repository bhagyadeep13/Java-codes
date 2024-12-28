package dynamic_programming;
import java.util.*;
public class print_LCS 
{
    public static int longestCommonSubsequence(String s1, String s2) 
    {                                                  // TABULALTION 
        int a= s1.length();                             //  T.C -- O(M*N)
        int b= s2.length();                             // S.C -- O(m*n)
        int[][] dp=new int[a+1][b+1];
        for(int m=1;m<dp.length;m++)
        {
            for(int n=1;n<dp[0].length;n++)
            {
                int p = dp[m-1][n-1];
                int q = dp[m][n-1];
                int r = dp[m-1][n];
                if(s1.charAt(m-1)==s2.charAt(n-1))
                {
                    
                    dp[m][n] = 1+p;
                }
                else
                {
                    dp[m][n] = Math.max(q,r);
                }
            }
        }
        StringBuilder s=new StringBuilder("");
        int i=a;
        int j=b;
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                s.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else 
            if(dp[i-1][j]>dp[i][j-1]) 
            {
                i--;
            }
            else j--;
        }
        s.reverse();
        System.out.println(s);
        return dp[a][b];
    }
    public static void main(String[] args) 
    {
        String s1="abcde";
        String s2="ace";
        System.out.println(longestCommonSubsequence(s1, s2));
    }
}
