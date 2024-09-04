package binarysearch;
import java.util.*;
public class search_rotated 
{
    static int search(int[] a,int x)
    {
        int st=0,end=a.length-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            else
            {
            if(a[st]<a[mid])
            {
                if(a[st]<=x&&x<a[mid])
                {
                    end=mid-1;
                }
                else st=mid+1;
            }
            else
            {
                if(a[end]>=x&&x>a[mid])
                {
                    st=mid+1;
                }
                else end=mid-1;
            }
        }
        }
        return -1;
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
        int ans=search(a,x);
        System.out.println(ans);
    }
}
