package Recursion;
import java.util.*;
public class l 
{
    public static void substr(int i,String s,String s1)  
    {
        if(i==s.length())
        {
            System.out.print(s1+" ");
            return;
        }
        substr(i+1,s,s1);
        substr(i+1,s,s1+s.charAt(i));
    }

    public static void substr2(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length()+1;j++)
            {
                System.out.print(s.substring(i, j)+" ");
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        substr(0, s, "");
        System.out.println();
        substr2(s);
    }
}
