package Recursion;
import java.util.*;
public class sum 
{
    static void printsum(int n,int sum)
    {
       if(n==0)
       {
       System.out.println(sum);
       return;
       }
       printsum(n-1, n+sum);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printsum(n,0);
    }
}
