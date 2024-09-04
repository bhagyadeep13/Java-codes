package Recursion;
import java.util.*;
public class binary_String 
{
    static void binary(String s,int n)
    {
        if(s.length()==n)
        {
        System.out.println(s);
        return;
        }
            binary(s+'0', n);
            binary(s+'1', n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binary("",n);
    }
}
