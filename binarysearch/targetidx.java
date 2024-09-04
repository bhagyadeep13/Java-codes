package binarysearch;
import java.util.*;
public class targetidx 
{
    static int tidx(int[] a,int t)
    {
        int st=0,end=a.length-1;
        int ans=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]==t)
            {
                return mid;
            }
            else
            {
                if(a[st]==a[mid]&&a[mid]==a[end])
                {
                    st++;
                    end--;
                }
                if(a[st]<a[mid]) // a to mid is sorted
                {
                   if(a[st]<=t&&t<a[mid]) // check if target in between st to mid
                   {
                       end=mid-1;
                   }
                   else
                   st=mid+1;
                }
                else // mid to end is sorted
                {
                   if(t>a[mid]&&t<=a[end]) // check if the target is between mid to end
                   {
                    st=mid+1;
                   }
                   else
                   end=mid-1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(tidx(a, t));
       }
    
    }

