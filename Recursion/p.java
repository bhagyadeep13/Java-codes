package Recursion;
import java.util.*;
public class p 
{
    static void generate(int[] a,int i,int value)
    {
        if(i==0)
        {
            System.out.println(value);
            return;
        }
        generate(a, i-1,value+(2*a[i]));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        generate(a,a.length-1,0);
    }
}

