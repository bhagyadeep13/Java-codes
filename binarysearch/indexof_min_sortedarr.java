package binarysearch;
import java.util.*;
public class indexof_min_sortedarr
{
    static int min(int[] a)
    {
        int n=a.length;
        int st=0,end=a.length-1;
        int ans=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]>a[n-1])
            {
               st=mid+1;
            }
            else
            {
                ans=mid;
                end=mid-1;
            }
        }
        return a[ans];
    }
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println(min(a));
   }

}

