package practice;

import java.util.Arrays;


public class a 
{
    static String s2="aeiouAEIOU";
    public static boolean isvowel(char ch)
    {
        if(s2.indexOf(ch)!=-1)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        String s1="";
        String s="lEetcOde";
        for(int i=0;i<s.length();i++)
        {
            if(isvowel(s.charAt(i)))
            s1=s1+s.charAt(i);
        }
        char[] ch1=s1.toCharArray();
        Arrays.sort(ch1);
    int j=0;
    for(int i=0;i<s.length();i++)
    {
        if(isvowel(s.charAt(i)))
        {
        System.out.println(s.charAt(i) +" "+ch1[j]);
        s=s.replace(s.charAt(i), ch1[j]);
        System.out.println(s);
        j++;
        }
    }
    System.out.println(s);
    }
}
