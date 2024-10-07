package Recursion;
import java.util.*;
public class gcd 
{
    static int greatest(int a,int b)
    {
        if(b%a==0) return a;
        return greatest(b%a,a);
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(greatest(n1, n2));
    }
}
