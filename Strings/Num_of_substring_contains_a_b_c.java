// 1358. Number of Substrings Containing All Three Characters

/*Given a string s consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of all these characters a, b and c. */

/*Input: s = "abcabc"
Output: 10 */

package Strings;
import java.util.*;
public class Num_of_substring_contains_a_b_c 
{
    public static int numberOfSubstrings(String s) 
    {                                               // T.C --> O(2*N)
        int count=0;
        int n=s.length();
        int CurrCount=0;
        int left=0;
        int[] freq=new int[3];
        for(int right=0;right<n;right++)
        {
            char ch = s.charAt(right);
            int idx = (int)ch - 97;
            freq[idx]++;
            if(freq[idx]==1)
            {
                CurrCount++;
            }
            while(CurrCount==3)  // shrinking phase 
            {
                count=count+(n-right);
                char c = s.charAt(left);
                idx = (int)c - 97;
                freq[idx]--;
                if(freq[idx]==0)
                {
                    CurrCount--;
                }
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        String s="abcabc";
        System.out.println(numberOfSubstrings(s));
    }
}
