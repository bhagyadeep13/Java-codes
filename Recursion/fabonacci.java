package Recursion;
import java.util.*;
public class fabonacci 
{
    static int fabo(int n)   // TIME COMPLEXITY -- O(N)
    {
       if(n==0||n==1)
       {
        return n;
       }
       return fabo(n-1)+fabo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fabo(n));
    }
}
