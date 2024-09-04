package Recursion;
import java.util.*;
public class generate_parenthesis 
{
    static void generate(int open,int close,String s,int n)
    {
        if(s.length()==n*2)
        {
        System.out.println(s);
        return;
        }
        if(open<n||s.length()==0)
        generate(open+1,close,s+'(', n);
        if(close<open)
        generate(open,close+1,s+')', n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generate(0,0,"",n);

    }
}
