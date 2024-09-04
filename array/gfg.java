package array;
import java.util.*;

public class gfg 
{
    public static Character first(List<Character> al)
    {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<al.size();i++)
        {
            if(h.containsKey(al.get(i)))
            {
                int freq=h.get(al.get(i));
                h.put(al.get(i),freq+1);
            }
            else
            h.put(al.get(i),1);
        }
        System.out.println(h);
        for(char key : h.keySet())
        {
            if(h.get(key)==1)
            return key;
        }
        return '#';
    }
    public static void helper(char[] ch,List<List<Character>> all)
    {
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                List<Character> al=new ArrayList<>();
                for(int k=i;k<=j;k++)
                {
                    al.add(ch[k]);
                }
                all.add(al);
            }
        }
    }
    public static void main(String[] args) 
    {
        char[] a={'a','a','b','c'};
        List<List<Character>> all=new ArrayList<>();
        helper(a,all);
        String s="";
        for(int i=0;i<all.size();i++)
        {
            s=s+first(all.get(i));
        }
        System.out.println(s);
        
    }
}
