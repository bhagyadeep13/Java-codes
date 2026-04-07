package Strings;
import java.util.*;
public class subsequences 
{
    public static void subString(String s,String s1,int i)
    {
        if(i==s.length())
        {
            System.out.println(s1);
            return;
        }
        subString(s, s1, i+1);
        subString(s, s1+s.charAt(i), i+1);
    }
    public static void main(String[] args) 
    {
        String s="abc";
        subString(s,"",0);
    }
}

