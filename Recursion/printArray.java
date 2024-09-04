package Recursion;
import java.util.*;
public class printArray 
{
    static void print(int[] a,int i)
    {
        if(i==a.length-1)
        {
        System.out.print(a[i]);
        return;
        }
       System.out.print(a[i]+" ");
       print(a, i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        print(a,0);
    }
}
