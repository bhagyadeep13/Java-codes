package Strings;
import java.util.*;
public class Stringpw2 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // UPDATE EVEN POSITION OF THE STRING
        String s="bhagyadeep";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            s1=s1+'a';
            else
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);

                                                 // == AND .EQUALS()                                                 
    String s2="abcxyz";
    String s4=s2;
    String s3=new String("abcxyz");
    System.out.println(s3==s2);             // == OPERATOR-(ADDRESS COMPARISON)
    System.out.println(s2.equals(s3));      // .EQUALS() METHOD-(CONTENT COMPARISON)
    System.out.println(s4==s2);   // TRUE
}
}