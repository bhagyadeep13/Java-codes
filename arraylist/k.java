package arraylist;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class k 
{
    public static String flip(String s1)
    {
        StringBuilder s2=new StringBuilder(s1);
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)==1) s2.setCharAt(i,'0');
            else s2.setCharAt(i,'1');
        }
        return s2.toString();
    }
    public static int helper2(int n1,String s1)
    {
        int i=0,j=0;
        int count=1;
        while(i<s1.length() && s1.charAt(i)=='0')
        {
            i++;
        }
        if(i==s1.length()) return 0;
        j=i+1;
        while(j<s1.length() && s1.charAt(j)=='1')
        {
            j++;
        }
        j--;
        i=j+1;
        j=i+1;
        while(i<s1.length() && j<s1.length())
        {
             while(i<s1.length() && s1.charAt(i)=='0')
            {
                i++;
            }
                if(i==s1.length()) return count;
                j=i+1;
            while(j<s1.length() && s1.charAt(j)=='1')
                {
                    j++;
                }
                j--;
            if(j==s1.length()) return count;
                count++;
                i=j+1;
                j=i+1;
        }
        return count;
    }
    public static int helper1(int n1,String s1)
    {
        int i=0,j=0;
        int count=1;
        while(i<s1.length() && s1.charAt(i)=='1')
        {
            i++;
        }
        if(i==s1.length()) return 0;
        j=i+1;
        while(j<s1.length() && s1.charAt(j)=='0')
        {
            j++;
        }
        j--;
        i=j+1;
        j=i+1;
        while(i<s1.length() && j<s1.length())
        {
             while(i<s1.length() && s1.charAt(i)=='1')
            {
                i++;
            }
                if(i==s1.length()) return count;
                j=i+1;
            while(j<s1.length() && s1.charAt(j)=='0')
                {
                    j++;
                }
                j--;
            if(j==s1.length()) return count;
                count++;
                i=j+1;
                j=i+1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n1;
        String s1;
        while(t>0)
        {   
            n1=sc.nextInt();
            s1=sc.next();
            System.out.println(helper2(n1, s1));
            System.out.println(Math.min(helper2(n1,s1),helper1(n1,s1)));
            t--;
        }
    }
}
