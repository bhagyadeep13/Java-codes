package Recursion;
import java.util.*;
public class p 
{
    public static void helper(int o,int c,String s,int n)
    {
        if(s.length()==2*n)
        {
            System.out.println(s);
            return;
        }
        if(o<n)
        {
            helper(o+1, c, s+"(",n);
        }
        if(c<o && c<n)
        {
            helper(o, c+1, s+")", n);
        }
    }
    public static void main(String[] args) 
    {
        int n=5;
        helper(0,0,"", n);
    }
}

