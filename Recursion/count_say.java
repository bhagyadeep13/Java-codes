package Recursion;
import java.util.*;
public class count_say
{
    static String count(int n)
    {
        if(n==1)
        {
        return "1";
        }
        String s=count(n-1);
        String s1="";
        int i=0,j=0;
        while(j<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                j++;
            }
            else
            {
                s1=s1+(j-i)+s.charAt(i);
                i=j;
            }
        }
        s1=s1+(j-i)+s.charAt(i);
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=count(n);
        System.out.println(s);
        
    }
}