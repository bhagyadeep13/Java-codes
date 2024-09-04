package array;
import java.util.*;
public class b 
{
    public static void main(String[] args) {
        int n=10;
        int factor=1;
        StringBuilder s=new StringBuilder("");
        while(n > 0)
        {
             s.append(n%2);
             n=n/2;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            s.setCharAt(i, '0');
            else
            s.setCharAt(i, '1');
        }
        int ans=0;
        int k=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            ans=ans+(Integer.parseInt(""+s.charAt(i))*(int)Math.pow(2,k));
            k++;
        }
        System.out.println(ans);
    }
}
