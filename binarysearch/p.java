package binarysearch;

public class p 
{
    public static boolean binarySearch(int[] a,int t,int st,int end)
    {
        if(st>end) return false;
        int mid = (st+end)/2;
        if(a[mid]==t) return true;
        else if(a[mid]<t) 
        {
            return binarySearch(a, t, mid+1, end);
        }
        else
        {
            return binarySearch(a, t, st, mid-1);
        }
        
    }
    public static int lowerBound(int[] a,int x)
    {
        int st = 0;
        int end = a.length-1;
        int lower = a.length;
        while(st<=end)
        {
            int mid = (st+end)/2;
            if(a[mid]>=x) 
            {
                lower = Math.min(lower,mid); // it can be potential answer 
                end = mid - 1;
            }
            else
            {
                st = mid + 1;
            }
        }
        return lower;
    }
    public static int upperBound(int[] a,int x)
    {
        int st = 0;
        int end = a.length-1;
        int upper = a.length;
        if(a[a.length-1]<x) return -1; 
        while(st<=end)
        {
            int mid = (st+end)/2;
            if(a[mid]>x) 
            {
                upper = Math.min(upper,mid); // it can be potential answer 
                end = mid - 1;
            }
            else
            {
                st = mid + 1;
            }
        }
        return upper;
    }
    public static int lowerk(int[] a,int x)
    {
        int st = 0;
        int end = a.length-1;
        int lower = a.length;
        while(st<=end)
        {
            int mid = (st+end)/2;
            if(a[mid]>=x) 
            {
                lower = Math.min(lower,mid); // it can be potential answer 
                end = mid - 1;
            }
            else
            {
                st = mid + 1;
            }
        }
        return lower;
    }
    public static void main(String[] args) 
    {
        int[] a= {5,7,7,8,8,10};
        System.out.println(binarySearch(a, 98,0,a.length-1));

        System.out.println(lowerBound(a, 8));

        System.out.println(upperBound(a, 8));


    }
}
