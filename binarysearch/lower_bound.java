package binarysearch;
import java.util.*;
public class lower_bound 
{
    static int lower(int x,int[] a,int st,int end)
    {
        int lb=0;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]<=x)
            {
                lb=Math.max(lb,mid);
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return lb;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int n1=lower(x, a,0,a.length);
        System.out.println(n1);

    }
}
