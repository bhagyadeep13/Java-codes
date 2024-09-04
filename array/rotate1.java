package array;
import java.util.*;
public class rotate1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        k=k%n;
        int[] a=new int[n];
        int[] a1=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=0;
        for(int i=n-k;i<n;i++)
        {
           a1[l]=a[i];
           l++;
        }
        for(int i=0;i<n-k;i++)
        {
            a1[l]=a[i];
            l++;
        }
        for(int i=0;i<a1.length;i++)
        {
            System.out.print(a1[i]+" ");
        }

    }
}
