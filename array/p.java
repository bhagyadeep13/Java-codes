package array;

public class p 
{
    public static int helper(int[] a,int i)
    {
        if(i==a.length) return 0;
        return a[i]+helper(a, i+1);
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4};
        System.out.println(helper(a, 0));
    }
}
