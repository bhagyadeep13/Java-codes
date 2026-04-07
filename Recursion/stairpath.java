package Recursion;
import java.util.*;
public class stairpath 
{
    static int stair(int n)
    { 
        if(n<=1) return 1;
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=stair(n);
        System.out.println(a);
    }
}
