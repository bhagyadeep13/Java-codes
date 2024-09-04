package Strings;
import java.util.*;
public class isSubstring 
{
    static int issubstring(String s,String s1)  // IS SUBSTRING METHOD USING INDEXOF METHOD
    {
        return s1.indexOf(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        System.out.println(issubstring(s, s1));
    }
}
