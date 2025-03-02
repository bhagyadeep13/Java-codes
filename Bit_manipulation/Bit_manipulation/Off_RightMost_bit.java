package Bit_manipulation;
import java.util.*;
public class Off_RightMost_bit 
{
    public static int helper1(int n)          // T.C -- O(LOG(N))
    {
        int m=n;
        int k=0;
        while(m%2==0)
        {
            m=m>>1;
            k++;
        }
        int mask=~(1<<k);
        int ans=n&mask;
        return ans;
    }
    public static int helper2(int n)         // T.C -- O(1)
    {
        int ans = n&(n-1);
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
    }
}
