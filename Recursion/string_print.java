package Recursion;
import java.util.*;
public class string_print 
{
    static void print(int i,String s)
    {
        if(i==s.length())
        return;
        System.out.print(s.charAt(i));
        print(i+1,s);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        print(0,s);
    }
}
