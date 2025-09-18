package binarysearch;
import java.util.*;
public class search_rotated 
{
    public static int search_rotate(int[] a,int t)
    {
        int st = 0;
        int end = a.length-1;
        while(st<=end)
        {
            int mid = st+(end-st)/2;
            if(a[mid]==t) return mid;
            else
            if(a[mid]<a[end])  // mid and end part sorted h 
            {
                if(t>a[mid] && t<=a[end])
                {
                    st = mid + 1;
                }
                else end = mid - 1;
            }
            else
            {
                if(t>=a[st] && t<a[mid]) 
                {
                    end = mid -1;
                }
                else
                    st = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a= {1,3,8,12,4,2};
        int x = 4;
        int ans=search_rotate(a,x);
        System.out.println(ans);

        System.out.println(search_rotate(a, x));
    }
}
