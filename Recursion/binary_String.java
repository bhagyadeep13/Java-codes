package Recursion;
import java.util.*;
public class binary_String 
{
    static void binary(String s,int n,List<String> al)
    {
        if(s.length()==n)               // T.C -- O(N*N)
        {
            al.add(s);
            return;
        }
            binary(s+'0', n,al);
            binary(s+'1', n,al);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> al=new ArrayList<>();
        binary("",n,al);
        System.out.println(al);
    }
}
