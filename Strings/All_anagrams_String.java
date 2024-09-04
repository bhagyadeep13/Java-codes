package Strings;
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
