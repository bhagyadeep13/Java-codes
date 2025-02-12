package Bit_manipulation;
import java.util.*;
public class clear_kth_bit 
{  
    // clear == turn off or set to 0
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int k=sc.nextInt();
        int mask = ~(1<<k); 

        int ans=n & mask;        // used & operator
        System.out.println(Integer.toBinaryString(ans));
    }
}
