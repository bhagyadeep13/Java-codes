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
        int st=0;
        int end=a.length-1;
        int ans=-1;
        while(st<=end)
        {
            int mid = (st+end)/2;
            if(a[mid]==x)
            {
                ans=mid;
                end=mid-1;
            }
            if(a[mid]>x)
            {
                end=mid-1;
            }
            if(a[mid]<x)
            {
                st=mid+1;
            }
        }
        return ans;
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
    public static int peakIdx(int[] a)
    {
        int st = 0;
        int end = a.length-1;
        while(st<=end)
        {
            int mid = (st+end)/2;
            if(a[mid]>a[mid+1] && a[mid]>a[mid-1]) return mid;
            else if(a[mid]>a[mid-1] && a[mid]<a[mid+1]) st = mid+1;
            else end=mid-1;
        }
        return -1;
    }
    public static int helper(int[] a,int t)
    {
        int st = 0;
        int end = a.length-1;
        while(st<=end)
        {
            int mid = st+(end-st)/2;
            if(a[mid]==t) return mid;
            if(a[mid]<a[end])
            {
                if(t>a[mid] && t<=a[end]) st=mid+1;
                else end=mid-1;
            }
            else
            {
                if(t>=a[st] && t<a[mid]) end=mid-1;
                else st = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        // int[] a= {5,7,7,7,8,10};
        // System.out.println(binarySearch(a, 98,0,a.length-1));

        // System.out.println(lowerBound(a, 7));

        // System.out.println(upperBound(a, 8));

        int[] b={1,2,3,4,5,6,3,2};
        System.out.println(peakIdx(b));

        int[] a= {1,3,8,12,4,2};
        int x = 4;
        System.out.println(helper(a, x));

    }
}
