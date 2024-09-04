package Strings;
import java.math.BigInteger;
import java.util.*;
public class BuiltinMethods
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="bhagyadeep";
        String s1="abcde";
        String s3="10";

        //STARTS WITH METHOD IN STRINGS
        System.out.println(s1.startsWith("abf"));

       /*// s.toLowerCase()       // Alone nothing
        System.out.println(s.toLowerCase());

        // s.toUpperCase()       // Alone nothing
        System.out.println(s.toUpperCase());

        // s.toConcatCase()       // Alone nothing
        System.out.println(s.concat(s1));

        //  INTEGER TO STRING METHOD
        int b=10;
        String s2=Integer.toString(b);
        System.out.println(s2.length());

        // CONVERT LONG/DOUBLE TO INT
        //double a=108.9;
        /*long c=10809779;
        int d=(int)a;
        System.out.println(d);

System.out.println(s.substring(1)); //PRINTS 1 TO END INDEX ELEMENTS
System.out.println(s.substring(1,3)); // PRINTS 1 TO 3-1=2 INDEX
*/
        //PRINT ALL SUBSTRING OF A STRING
        for(int i=0;i<s1.length();i++)
        {
            for(int j=s1.length();j>i;j--)
            {
                System.out.println(s1.substring(i,j));
            }
        }
    }
}