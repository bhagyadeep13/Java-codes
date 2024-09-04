
// 1930. Unique Length-3 Palindromic Subsequences

// Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
// Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
// A palindrome is a string that reads the same forwards and backwards.
// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
// For example, "ace" is a subsequence of "abcde".

package Leetcode_IMP.HashMaps;
import java.util.*;
public class Leetcode_1930 
{
    public static int countPalindromicSubsequence(String s) 
    {
         int count=0;
         HashMap<Character,Integer> h1=new HashMap<>();   
         HashMap<Character,Integer> h2=new HashMap<>();
         for(int i=0;i<s.length();i++)
         {
            if(!h1.containsKey(s.charAt(i)))     // Store first occurence of all character
            {
                h1.put(s.charAt(i),i);
            }
            h2.put(s.charAt(i), i);        // Store first occurence of all character
         }
         for(char key : h1.keySet())
         {
            int a=h1.get(key);
            int b=h2.get(key);
            HashSet<Character> h=new HashSet<>();      
            for(int i=a+1;i<=b-1;i++)      // calculating all unique character btw a and b
            {
                h.add(s.charAt(i));
            }
            count=count+h.size();
         }
         return count;
    }
        
      public static void main(String[] args) 
    {
       String s="aabca";
       System.out.println(countPalindromicSubsequence(s));
    }
}
