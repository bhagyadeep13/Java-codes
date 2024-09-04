package Strings;
import java.util.*;
public class isomorphic 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[] ch=new char[26];
        for(int i=0;i<s1.length();i++)
        {
            int ascii=(int)s1.charAt(i);
            if(ch[ascii-97]=='\0')
            {
            ch[ascii-97]=s2.charAt(i);
            }
            else
            {
                if(ch[ascii-97]!=s2.charAt(i))
                {
                System.out.println(false);
                return;
                }
            }
        }
        System.out.println(true);
    }
}
