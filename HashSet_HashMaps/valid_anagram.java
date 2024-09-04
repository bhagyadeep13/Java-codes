package HashSet_HashMaps;
import java.util.*;
public class valid_anagram 
{
    public static boolean isAnagram(String s, String t) 
    {
        HashMap<Character,Integer> smap=new HashMap<>();
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(smap.containsKey(s.charAt(i)))
            {
                int freq=smap.get(s.charAt(i));
                smap.put(s.charAt(i), freq+1);
            }
            else
            smap.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++)
        {
            if(tmap.containsKey(t.charAt(i)))
            {
                int freq=tmap.get(t.charAt(i));
                tmap.put(t.charAt(i), freq+1);
            }
            else
            tmap.put(t.charAt(i),1);
            
        }
        for(char key : smap.keySet())
        {
            int val1=smap.get(key);
            if(!tmap.containsKey(key)) return false;  // Agar vo key tmap me nhi ho toh
            int val2=tmap.get(key);
            if(val1!=val2)
            return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s, t));
    }
}
