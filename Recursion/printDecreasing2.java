package Recursion;
import java.util.*;
public class printDecreasing2
 {
    static int n;
    static void printnum(int x)
    {
        if(x>n)
        return;
        System.out.print(x+" ");
        printnum(x+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        printnum(1);
    }
}
