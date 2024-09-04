package binarysearch;
import java.util.*;
public class bianryseach_recursion 
{
    static boolean search(int[] a,int t,int st,int end)
    {
        if(st<=end)
        {
            return false;
        }
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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(search(a,target,0,a.length-1));
    }
}
