package frequently_used;
import java.util.*;
public class prime_num 
{
    public static boolean prime(int n)   // TIME COMPLEXITY -- O(SQRT(N))
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
    public static void main(String[] args) 
    {
        int n=6;
        System.out.println(prime(n));
    }
}
