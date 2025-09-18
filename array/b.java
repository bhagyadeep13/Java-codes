package array;
import java.util.*;
public class b 
{
    public static void helper(int[] a,int i,int j)
    {
        while(i<=j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5};
        int k=2;
        k=k%a.length;
        int val = a.length-k-1;
        helper(a,0,a.length-k-1);
        helper(a, a.length-k, a.length-1);
        helper(a, 0, a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" "+val);
        }
    }
}
