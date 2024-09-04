package Recursion;
import java.util.*;
public class s
{
    public static void helper1(String s,List<String> al)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length()+1;j++)
            {
                al.add(s.substring(i, j));
            }
        }
    }
    public static boolean isvalid(String s)
    {
        for(int i=1;i<s.length();i++)
        {
            if(i%2!=0)
            {
            if(Integer.parseInt(s.charAt(i)+"")-Integer.parseInt(s.charAt(i-1)+"")!=1)
            {
                return false;
            }
            }
            else
            {
                if(Integer.parseInt(s.charAt(i)+"")-Integer.parseInt(s.charAt(i-1)+"")!=-1)
            {
                return false;
            }
            }
        }
        return true;
    }
    public static int helper2(List<String> al)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++)
        {
            if(isvalid(al.get(i)))
            {
                  max=Math.max(max,al.get(i).length());
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        List<String> al=new ArrayList<>();
        String ans="456";
        helper1(ans, al);
        System.out.println(helper2(al));
    }
}
