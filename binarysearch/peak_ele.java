package binarysearch;
import java.util.*;
public class peak_ele 
{
    static int peak(int[] a)
    {
        int n=a.length;
        int st=0,end=n-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]>a[mid+1]&&a[mid]>a[mid-1])
            {
                return a[mid];
            }
            if(a[mid]<a[mid+1])
            {
                st=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return 1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(peak(a));
    }
}
