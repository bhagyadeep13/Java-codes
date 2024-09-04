package sort;
import java.util.*;
public class s 
{
    static int minidx(int[] a)
    {
        int n=a.length;
        int st=0,end=n-1;
        int ans=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]>a[n-1]) // sorted part of the array
            {
                st=mid+1;
            }
            else // unsorted part of the array
            {
                end=mid-1;
                ans=mid;

            }
        }
        return ans;
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
        System.out.println(minidx(a));
    }
}
