package Recursion;
import java.util.*;
public class q 
{
    public static boolean helper(String s)
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
    public static void main(String[] args) 
    {
        String s="343";
        System.out.println(helper(s));
    }
}
