
// 2595. NUMBER OF EVEN AND ODD BITS

// You are given a positive integer n.
//Let even denote the number of even indices in the binary representation of n with value 1.
//Let odd denote the number of odd indices in the binary representation of n with value 1.
//Note that bits are indexed from right to left in the binary representation of a number.
//Return the array [even, odd].

package HashSet_HashMaps;
import java.util.*;
public class leet_2595_even_odd_bits 
{
    public static int[] evenOddBit(int n) 
    {
        int[] a=new int[2];
        StringBuilder s=new StringBuilder("");
        while(n>0)
        {
            s.append(n%2);
            n=n/2;
        }
        System.out.println(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                if(i%2==0)
                a[0]++;
                else
                a[1]++;
            }
        }
        return a;
    }
    public static void main(String[] args) 
    {
        int[] a=evenOddBit(2);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
