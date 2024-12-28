// 1092. Shortest Common Supersequence 

/*Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences. If there are multiple valid strings, return any of them.
A string s is a subsequence of string t if deleting some number of characters from t (possibly 0) results in the string s. */

/*Input: str1 = "abac", str2 = "cab"
Output: "cabac" */

package dynamic_programming;
import java.util.*;
public class Shortest_common_supersequence 
{
    public static String LCS(String s1, String s2) 
    {                                                  // TABULALTION 
        int a= s1.length();                             //  T.C -- O(M*N)
        int b= s2.length();                             // S.C -- O(m*n)
        int[][] dp=new int[a+1][b+1];
        for(int m=1;m<=a;m++)
        {
            for(int n=1;n<=b;n++)
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
            else if(dp[i-1][j]>dp[i][j-1]) 
            {
                i--;
            }
            else j--;
        }
        s.reverse();
        return s.toString();
    }
    public static void main(String[] args) 
    {
        String s1="abcde";
        String s2="gahbic";
        int m=s1.length();
        int n=s2.length();
        String lcs=LCS(s1, s2);
        int i=0,j=0,k=0;
        StringBuilder ans=new StringBuilder("");
        while(i<m && j<n && k<lcs.length())
        {
            while(i<m && s1.charAt(i)!=lcs.charAt(k)) 
            {
                ans.append(s1.charAt(i));
                i++;
            }
            while(j<n && s2.charAt(j)!=lcs.charAt(k))
            {
                ans.append(s2.charAt(j));
                j++;
            }
            ans.append(lcs.charAt(k));
            k++;
            i++;
            j++;
        }
        while(i<m)
        {
            ans.append(s1.charAt(i));
            i++;
        }
        while(j<n)
        {
            ans.append(s2.charAt(j));
            j++;
        }
        System.out.println(ans);
    }
}
