package Bit_manipulation;

public class swap_two_num 
{
    public static void main(String[] args) {
        int a=10;
        int b=30;
        System.out.println(a+" "+b);  // swapping using XOR operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);
    }
}
