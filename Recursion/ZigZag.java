package Recursion;
import java.util.*;
public class ZigZag 
{
    static void pip(int n)
    {
        if(n==0)
        return;
        System.out.print(n);    //pre
        pip(n-1);
        System.out.print(n);    //In
        pip(n-1);
        System.out.print(n);    //Post
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pip(n);
    }
}
