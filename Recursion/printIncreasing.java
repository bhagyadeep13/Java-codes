package Recursion;
import java.util.*;
public class printIncreasing 
{
    static void num(int n,int n2)
    {
        if(n==n2)
        {
        System.out.println(n2);
        return;
        }
        System.out.print(n+" ");
        num(n+1,n2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        num(1,n);
    }
}
