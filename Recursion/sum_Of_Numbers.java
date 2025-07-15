package Recursion;
import java.util.*;
public class sum_Of_Numbers 
{
    public static int sum_Of_Numbers(int n,int sum)
    {
        if(n==0) return sum;
        sum=sum+n;
        return sum_Of_Numbers(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum_Of_Numbers(n,0));
    }
}
