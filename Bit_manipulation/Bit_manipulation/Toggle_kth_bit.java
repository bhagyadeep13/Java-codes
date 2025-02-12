package Bit_manipulation;
import java.util.*;
public class Toggle_kth_bit 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int k=sc.nextInt();
        int mask = (1<<k); 

        int ans = n^mask;    // toggle ke liye XOR use kiya h
        System.out.println(Integer.toBinaryString(ans));
    }
}
