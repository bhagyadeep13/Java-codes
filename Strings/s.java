package Strings;
import java.util.*;
public class s 
{
    public static void subString(String s,String s1,int i)
    {
        if(i==s.length()) 
        {
            System.out.print(s1+" ");
            return;
        }
        subString(s, s1, i+1);
        subString(s, s1+s.charAt(i), i+1);
    }
       public static void main(String[] args) 
    {
        String s="abccccdd";
        List<String> al=new ArrayList<>();
        subString(s,"",0);
    }
}

