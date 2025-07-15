package Recursion;
import java.util.*;
public class power 
{
    public static int pow(int a,int b)
    {
        if(a==1 || b==0) return 1;
        return a*pow(a,b-1);
    }
    public static int pow2(int a,int b)  // T.C -- O(LOG(N))
    {
        if(a==1 || b==0) return 1;
        int val =  pow(a,b/2);
        if(b%2==0)
        {
            return val*val;
        }
        else
        { 
            return a*val*val;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(pow(a, b));

        System.out.println(pow2(a, b));
    }
}
