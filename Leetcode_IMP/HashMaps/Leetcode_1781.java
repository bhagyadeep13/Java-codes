
// 1781. Sum of Beauty of All Substrings

// The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.
// For example, the beauty of "abaacc" is 3 - 1 = 2.
// Given a string s, return the sum of beauty of all of its substrings.

package Leetcode_IMP.HashMaps;
import java.util.*;
public class Leetcode_1781 
{
    // calculate all the subsequences
   public static void substring(String s,List<String> al) 
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length()+1;j++)
            {
                al.add(s.substring(i, j));
            }
        }
        System.out.println(al);
    }

   // calculate diff btw frequencies of most frequent and less frequent character
    public static int helper(String s) 
    {
        int maxidx=Integer.MIN_VALUE;
        int minidx=Integer.MAX_VALUE;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i)))
            {
                int freq=h.get(s.charAt(i));
                h.put(s.charAt(i), freq+1);
            }
            else
            h.put(s.charAt(i),1);
        }
        for(int val : h.values())
        {
            maxidx=Math.max(maxidx,val);
            minidx=Math.min(val, minidx);
        }
        return maxidx-minidx;
    }
    public static void main(String[] args) 
    {
        int count=0;
        List<String> al=new ArrayList<>();
        String s="aabcbaa";
        substring(s, al);
        for(int i=0;i<al.size();i++)       // sum of differences of all subsequences
        {
            count=count+helper(al.get(i));
        }
        System.out.println(count);
    }
}
