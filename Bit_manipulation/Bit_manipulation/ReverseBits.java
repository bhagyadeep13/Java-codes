package Bit_manipulation;
import java.util.*;
public class ReverseBits 
{
    public static void main(String[] args) {
        int n=10;
        StringBuilder s=new StringBuilder(Integer.toBinaryString(n));
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        System.out.println((int)Long.parseLong(s.toString(),2));
    }
}
