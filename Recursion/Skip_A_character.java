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
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        print(0,s,"");
    }
}
