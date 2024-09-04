package binarysearch;
import java.util.*;
public class binarybasic 
{
    static boolean binary(int[] a,int t)
    {
        int n=a.length;
        int st=0,end=a.length-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(mid==t)
            {
                return true;
            }
            if(t>a[mid])
            {
                st=mid+1;
            }
            else
            if(t<a[mid])
            {
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(binary(a, target));
    }
}
