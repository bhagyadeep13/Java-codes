package Bit_manipulation;
import java.util.*;
public class xor_In_range 
{
    public static int xor(int n)  // calculate XOR of ans number from 1 to n
    {
        if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return 0;
        else return n;
    }
    public static void main(String[] args) 
    {
        int st=3;                             // T.C -- O(1)
        int end=9;
        int ans = xor(st-1) ^ xor(end);
        System.out.println(ans);
    }
}
