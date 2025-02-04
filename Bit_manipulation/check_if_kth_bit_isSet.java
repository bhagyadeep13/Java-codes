package Bit_manipulation;
import java.util.*;
public class check_if_kth_bit_isSet 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int mask = 1<<k;
        if((n&mask)==0)
        {
            System.out.println("bit not set");
        }
        else
        {
            System.out.println("bit set");
        }
    }
}
