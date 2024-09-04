//MINIMIZED MAXIMUM OF PRODUX=CTS DISTRIBUTED TO ANY STORE

package binarysearch;
import java.util.*;
public class leetcode_2064 
{
    static int minimized_products(int[] a,int x)
    {
        int st=1,end=0,ans=0;
        for(int i=0;i<a.length;i++)        // end = max element of array
        {
            end=Math.max(end,a[i]);
        }
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(a,x,mid)==true)
            {
                ans=mid;
                end=mid-1;
            }
            else st=mid+1;
        }
        return ans;
    }
    static boolean isPossible(int[] a,int x,int mid)
    {
        int st=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%mid!=0)
            st=st+a[i]/mid+1;
            else
            st=st+a[i]/mid;
        }
        if(st>x)
        return false;
        else
        return true;
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
        System.out.println(minimized_products(a,x));
    }
}
