package Strings;

import java.text.DecimalFormat;
import java.util.*;

public class p {
    public static boolean isDigit(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(Integer.parseInt(s.charAt(i)+"")>0 || Integer.parseInt(s.charAt(i)+"")<9)
            count++;
        }
        if(count==s.length())
        return true;
        else
        return false;
    }
    static String filter(String s)
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
    public static void main(String[] args) 
    {
        String s="foobar";
        char letter='o';
        double count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==letter)
            count++;
        }
        double d=(count/6)*100;
        System.out.println((int)d);
    }
}
    

