package Strings;
import java.util.*;
public class sort_frequency 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] a=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int ascii=(int)s.charAt(i);
            a[ascii-97]=a[ascii-97]+1;
        }
        int maxfreq=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
             maxfreq=Math.max(maxfreq,a[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==maxfreq)
            {
            char ch=(char)(i+97);
            System.out.print(ch);
            }
        }
    }
}
