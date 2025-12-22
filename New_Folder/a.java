import java.util.*;
public class a 
{
    public static void main(String[] args) 
    {
        String s = "3121";
        char digit = '1';
        long max = Long.MIN_VALUE;
        StringBuilder s1= new StringBuilder(s);
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==digit)
            {
                String left = s1.substring(0,i);
                String right = s1.substring(i+1);
                long val = Long.parseLong(left+right);
                if(val>max)
                {
                    max=val;
                }
            }   
        }
        System.out.println(max);
    }
}
