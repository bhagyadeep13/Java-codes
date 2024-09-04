package Strings;
import java.util.*;
public class subsequence 
{
    public static void  subsequencecount(String s,List<String> al)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length()+1;j++)
            {
                al.add(s.substring(i, j));
            }
        }
    }
    public static void main(String[] args) 
    {
        List<String> al=new ArrayList<>();
        String s="abc";
        subsequencecount(s, al);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}
