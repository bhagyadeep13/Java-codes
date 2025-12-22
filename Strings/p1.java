package Strings;

public class p1 
{
    public static void helper(String s,String s1,int i)
    {
        if(i==s.length())
        {
            System.out.println(s1);
            return;
        }
        helper(s, s1, i+1);
        helper(s, s1+s.charAt(i), i+1);
    }
    public static void main(String args[])
    {
        String s = "abc";
        helper(s, "", 0);
    }
}
