package Recursion;

public class k 
{
    
    public static void main(String[] args)
    {
        int n  = Integer.parseInt("0100",2);
        System.out.println(n>>2);
        int ans = n>>2;
        String s2 = Integer.toString(ans,2);
        System.out.println(s2);
    }    
}
