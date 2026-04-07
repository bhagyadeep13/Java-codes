package Strings;
import java.util.*;
public class substring 
{
    public static void  subStringcount(String s,List<String> al)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                al.add(s.substring(i, j+1));
            }
        }
    }
    public static void main(String[] args) 
    {
        List<String> al=new ArrayList<>();
        String s="abc";
        subStringcount(s, al);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}
