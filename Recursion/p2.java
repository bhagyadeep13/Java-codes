package Recursion;
import java.util.*;
public class p2 
{
    static int binary(int n,int sum)
    {
        if(n==0)
        return sum;
        return binary(n-1,sum+n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(binary(n,0));
    }
}
