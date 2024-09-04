package Strings;
import java.util.*;
public class Reverse_Eachwords 
{
    static void rev(StringBuilder s,int st,int end)
    {
        while(st<end)
        {
            char temp=s.charAt(st);
            s.setCharAt(st,s.charAt(end));
            s.setCharAt(end,temp);
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder("i am raghav garg");
        /*String s1=s.toString();
        s.reverse();
        System.out.println(s);*/
        int i=0,j=0;
        while(j<s.length())
        {
            if(s.charAt(j)!=' ')
            {
                j++;
            }
            else
            {
                rev(s,i,j-1);
                i=j+1;
                while(s.charAt(i)==' ')
                {
                    i++;
                }
                j=i;
            }
        }
        rev(s,i,j-1);
        System.out.println(s);
        
    }
}
