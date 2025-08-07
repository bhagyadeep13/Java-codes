package binarysearch;

public class a 
{
    public static int peakIndex(int[] a)
    {
        int st = 1;
        int end = a.length-2;
        while(st<=end)
        {
            int mid = (st+end)/2;
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1]) return mid;
            else
            if(a[mid]<a[mid-1] && a[mid]<a[mid+1]) return mid-1;
            else
            if(a[mid]>=a[mid-1] && a[mid]<=a[mid+1]) // incresing part ya same level h matlab piche nhi milega
            {
                st = mid + 1;
            }
            else
            {
                end = mid -1;
            }
        }
        return -1;
    }
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
            if(t<a[mid])
            {
                end=mid-1;
            }
        }
        return false;
    }
    static int binaryIndex(int[] a,int t)
    {
        int n=a.length;
        int st=0,end=a.length-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(mid==t)
            {
                return mid;
            }
            if(t>a[mid])
            {
                st=mid+1;
            }
            if(t<a[mid])
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int[] a= {};
        int t=0;
        if(a.length<=2)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==t)
                {
                    System.out.println();
                    return;
                }
            }
        }
        if(binary(a, t))
        {
            System.out.println(-1);
            return;
        }
        int idx = peakIndex(a);
        if(idx==-1) 
        {
            System.out.println(-1);
            return;
        }
        else
        {
            System.out.println(binaryIndex(a, t));
        }

    }
}
