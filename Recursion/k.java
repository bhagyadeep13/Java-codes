package Recursion;

public class k 
{
    public static void helper(int n,String s)
    {
        if(s.length()==n)
        {
            System.out.println(s);
            return;
        }
        if(s.length()!=0 && s.charAt(s.length()-1)=='1')
        {
            helper(n,s+'0');
        }
        else
        {
            helper(n,s+'0');
            helper(n,s+'1');
        }
    }
    public static boolean subsetsum(int[] a,int n,int t)
    {
        if(t==0) return true;
        if(n<0) return false;
        if(a[n]<=t)
        {
            boolean skip = subsetsum(a,n-1,t);
            boolean take = subsetsum(a, n-1, t-a[n]);
            return skip || take;
        }
        else
        {
            return subsetsum(a,n-1,t);
        }
    }
    public static void main(String[] args)
    {
        int n=3;
        helper(n, "");
        int[] a= {1,2,3};
        System.out.println(subsetsum(a, a.length-1, 4));
    }    
}
