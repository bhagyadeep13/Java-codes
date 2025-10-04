package practice;

public class a1 
{
    public static int helper(int n)
    {
        if(n<=1) return n;
        return helper(n-1)+helper(n-2);
    }
    public static void main(String[] args) 
    {
        int n = 3;
        System.out.println(helper(n));
    }
}
