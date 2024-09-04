package Strings;
import java.util.*;
public class isvowel 
{
    static String s="aeiouAEIOU";
    static int isVowel(char ch)
    {
        return s.indexOf(ch);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i))!=-1)
            s2=s2+s.charAt(i);
        }
        System.out.println(s2);
    }
}
