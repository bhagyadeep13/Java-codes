package Recursion;
import java.util.*;
public class sum2 
{
    static int printsum(int n,int sum)
    {
        if(n==0)
        return 0;
        sum=sum+n;
        return n+printsum(n-1, sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(printsum(n, 0));

    }
}
