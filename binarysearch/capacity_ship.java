package binarysearch;
import java.util.*;
public class capacity_ship 
{
    static void capacity(int[] a,int t)
    {
        int end=0,st=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            end=end+a[i];
            st=Math.max(st,a[i]);
        }
        int ans=end;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(mid,a,t)==true)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        System.out.println(ans);
        
    }
    static boolean isPossible(int mid,int[] a,int t)
    {
        int d=1,load=0;
        for(int i=0;i<a.length;i++)
        {
            if(load+a[i]<=mid)
            {
                load=load+a[i];
            }
            else
            {
                load=a[i];
                d++;
            }
        }
        if(d>t)
        {
            return false;
        }
        else
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        capacity(a,t);
    }
}
