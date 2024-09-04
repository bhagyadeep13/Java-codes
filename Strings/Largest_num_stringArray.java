package Strings;
import java.util.*;
public class Largest_num_stringArray 
{
    static String max(String a,String b)
    {
        String c=purify(a);
        String d=purify(b);
        if(c.length()>d.length()) return a;
        if(d.length()>c.length())  return b;
        if(c.length()==d.length())
        {
        for(int i=0;i<c.length();i++)
        {
            if((int)c.charAt(i)>(int)d.charAt(i)) return a;
            if((int)d.charAt(i)>(int)c.charAt(i)) return b;
        }
        }
        if(a.length()>b.length())  return a;
        else
        return b;

    }
    static String purify(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0')
            {
                return s.substring(i);
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s={"2","0","977","978"};
        String maxnum="";
        for(int i=0;i<s.length;i++)
        {
            maxnum=max(maxnum,s[i]);
        }
        System.out.println(maxnum);
    }
}
