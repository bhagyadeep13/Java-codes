package Bit_manipulation;
import java.util.*;
public class power_of_two 
{
    public static void main(String[] args) 
    {
        // calculate pow(2,a) in T.C -- O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(1<<n);
    }
}
