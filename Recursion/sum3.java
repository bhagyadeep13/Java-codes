package Recursion;
import java.util.*;
public class sum3 
{
    static int summ(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        sum=sum+n;
        return summ(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        System.out.println(summ(t, 0));
    }
}
