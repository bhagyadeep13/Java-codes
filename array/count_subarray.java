package array;
import java.util.*;
public class count_subarray 
{
    public static void subarraycount(int[] a,int K)
    {
        int sum=0,count=0;
        for(int i=0;i<a.length;i++)
        {
            sum=0;
            for(int j=i;j<a.length;j++)
            {
                sum=sum+a[i];
                if(sum==K)
                {
                    count++;
                }
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
