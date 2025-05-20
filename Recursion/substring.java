package Recursion;
import java.util.*;
public class substring 
{
    static void substr(int i,String s,String s1)  // not consecutive(substring)
    {
        if(i==s.length())
        {
        System.out.print(s1+" ");
        return;
        }
        substr(i+1, s, s1+s.charAt(i));
        substr(i+1,s,s1);
    } 
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    substr(0,s,"");
    System.out.println();
   }    
}
