package Bit_manipulation;
import java.util.*;
public class Bitwise_operators 
{
    public static void main(String[] args) 
    {
        // bitwise AND and OR
        System.out.println(5&9);
        System.out.println(5|9);

        // bitwise XOR
        // even number of bits = 0
        // odd number of bits = 1
        System.out.println(4^3);
        System.out.println(1^1);

        // 1's complement
        System.out.println(~5); // 1's complement of x = -x-1

        // 2's complement
        // find 2's complement of 5
        System.out.println(~5+1); // 2's complement of x = -x


    }
}
