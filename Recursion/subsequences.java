package Recursion;
import java.util.*;
public class subsequences 
{
    static void subsequences(int i,String s,String s1)  // T.C == O(POW(2,N))
    {
        if(i==s.length())
        {
        System.out.print(s1+" ");
        return;
        }
        subsequences(i+1, s, s1+s.charAt(i));
        subsequences(i+1,s,s1);
    } 
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    subsequences(0,s,"");
    System.out.println();
   }    
}
