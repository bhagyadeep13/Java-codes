// 451. Sort Characters By Frequency

/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.
 */

/*
Input: s = "tree"
Output: "eert"
*/
package Heaps_priority_queue;
import java.util.*;
public class Sort_Characters_freq 
{
    public static class Pair implements Comparable<Pair>
    {
        char key;
        int val;
        Pair(char key,int val)
        {
            this.key=key;
            this.val=val;
        }
        public int compareTo(Pair p)
        {
            return this.val-p.val;
        }

    }
    public static String frequencySort(String s) 
    {
        StringBuilder s1=new StringBuilder("");
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i)))
            {
                int freq=h.get(s.charAt(i));
                h.put(s.charAt(i),freq+1);
            }
            else
                h.put(s.charAt(i),1);
        }
        PriorityQueue<Pair> p=new PriorityQueue<>(Collections.reverseOrder());
        for(char ele : h.keySet())
        {
            Pair pa=new Pair(ele, h.get(ele));
            p.add(pa);
        }
        while(p.size()>0)
        {
            Pair p2=p.remove();
            int val=p2.val;
            while(val>0)
            {
                s1.append(p2.key);
                val--;
            }
        }
        return s1.toString();
    }
    public static void main(String[] args) 
    {
        String s="cccaaa";
        System.out.println(frequencySort(s));
    }
}
