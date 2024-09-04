// 438. Find All Anagrams in a String

/*Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. */

/*
 * Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
 */

package sliding_window;
import java.util.*;
public class All_anagrams_String
{
    public static boolean helper(String s,int a,int b,char[] ch1)
    {
        char[] ch=s.substring(a,b+1).toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=ch1[i]) return false;
        }
        return true;
    }
    public static List<Integer> findAnagrams(String s, String p)  // sliding window method
    {
        char[] ch1=p.toCharArray();
        Arrays.sort(ch1);
        int i=0,j=p.length()-1;
        List<Integer> al=new ArrayList<>();
        while(j<s.length())
        {
            if(helper(s,i,j,ch1)) 
            {
                al.add(i);
            }
            i++;
            j++;
        }
        return al;
    }
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        System.out.println(findAnagrams(s, p));
    }
}
