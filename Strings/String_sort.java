package Strings;
import java.util.*;
public class String_sort 
{
    static void sort(StringBuilder s)
    {
        int n=s.length();
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if((int)s.charAt(min)>(int)s.charAt(j))
                {
                    min=j;
                }
            }
            char temp= s.charAt(i);
            s.setCharAt(i,s.charAt(min));
            s.setCharAt(min, temp);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s= new StringBuilder(sc.nextLine());
        sort(s);
    }
}
