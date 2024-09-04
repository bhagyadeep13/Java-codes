package HashSet_HashMaps;
import java.util.*;
public class Long_substr_without_repeating_characters 
{
    public static int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,maxLen=Integer.MIN_VALUE;
       while(j<s.length())
       {
            char ch=s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i)
            {
                int len=j-i;  // pehle i to j tak length nikal lo
                maxLen=Math.max(len,maxLen);
                while(s.charAt(i)!=ch) i++;  // then i ko leke jao jab tak ki purane wale ke ek aage nhi pahunch jate
                i++;
            }
            map.put(ch, j);
            j++;
        }
            int len=j-i;
            maxLen=Math.max(len,maxLen);
            return maxLen;
       }
    public static void main(String[] args) 
    {
        String s="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
