package Recursion;
import java.util.*;
public class Skip_A_character 
{
    static void print(int i,String s,String s1)
    {
        if(i==s.length())
        {
        System.out.println(s1);
        return;
        }
        if(s.charAt(i)!='a')
        {
            s1=s1+s.charAt(i);
        }
        print(i+1,s,s1);
    }
    public static void helper2(String s,int  i)
    {
        if(i==s.length()) return;
        System.out.print(s.charAt(i)+" ");
        helper2(s,i+1);
    }
    public static String helper(String s,String s1,int i)
    {
        if(i==s.length())
        {
            return s1;
        }
        if(s.charAt(i)=='a')
        {
            return helper(s,s1,i+1);
        }
        else
            return helper(s,s1+s.charAt(i),i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        print(0,s,"");
        System.out.println(helper(s,"",0));
        helper2(s, 0);
    }
}
