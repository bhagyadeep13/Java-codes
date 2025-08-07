package binarysearch;
import java.util.*;
public class bianryseach_recursion 
{
    static boolean search(int[] a,int t,int st,int end)
    {
        if(st>end) return false;
        int mid=st+(end-st)/2;
        if(a[mid]==t)
        {
            return true;
        }
        else
        if(a[mid]>t)
        {
            return search(a,t,st,mid-1);
        }
        else
        {
            return search(a,t,mid+1,end);
        }
    }
    public static void main(String[] args) {
        int[] a = {0,1,2};
        int t = 0;
        System.out.println(search(a,t,0,a.length-1));
    }
}
