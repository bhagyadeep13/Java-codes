package PrefixSum;
import java.util.*;
public class pivot_idx 
{
    public static int pivotInteger(int n) 
    {
        int[] a=new int[1000];
        for(int i=1;i<=n;i++)
        {
            a[i]=a[i-1]+i;
        }
        for(int i=1;i<a.length;i++)
        {
            System.out.println(a[i] +" "+ (a[n]-a[i-1]));
            if(a[i]==(a[n]-a[i-1])) return i;
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(pivotInteger(n));
    }
}
