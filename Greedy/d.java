package Greedy;
import java.util.*;
public class d 
{
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        int i=2;
        while(i<=Math.sqrt(n))
        {
            if(n%i==0) return false;
            i++;
        }
        return true;
    }
    public static boolean istwin(int a,int b)
    {
        if(isPrime(a) && isPrime(b) && Math.abs(a-b)==2)
        return true;
        else return false;
    }
    public static void main(String[] args) 
    {
        int n=13;
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(istwin(i,j))
                System.out.print(i+","+j+" ");
            }
        }
    }
}
