package Strings;
import java.util.*;
public class string_compression 
{
    static String compress(char[] ch)
    {
        String s1="";
        int i=0,j=0;
        while(j<ch.length)
        {
            if(ch[i]==ch[j])
            {
                j++;
            }
            else
            {
                if(j-i==1)
                {
                s1=s1+ch[i];
                }
                else
                {
                s1=s1+ch[i]+(j-i);
                }
                i=j;
            }
        }
        s1=s1+ch[i]+(j-i);
       return s1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        String s1=compress(ch);
        System.out.println(s1.charAt(2));
        
    }
}
