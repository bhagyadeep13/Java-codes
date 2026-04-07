package array;
import java.util.*;
public class count_subarray 
{
    public static void subarraycount(int[] a,int K)
    {
        int sum=0,count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                System.out.println("1");
            }
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) 
    {
        int[] a={1,1,2};
        int k=2;
        subarraycount(a, k);
    }
}
