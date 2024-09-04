package binarysearch;
import java.util.*;
public class FirstOcurrence 
{
    static int firstOcurrence(int[] a,int t)
    {
        int n=a.length;
        int st=0,end=n-1;
        int fo=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]==t)
            {
                fo=mid;
                end=mid-1;
            }
            else
            if(t<a[mid])
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return fo;
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
        System.out.println(firstOcurrence(a, target));
    }
    
    
}
