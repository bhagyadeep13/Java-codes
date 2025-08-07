package binarysearch;
import java.util.*;
public class peakindex 
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
    public static void main(String[] args) {
        int[] a={5, 6, 1, 2, 3, 4};
        System.out.println(peakIndex(a));
    }
}
