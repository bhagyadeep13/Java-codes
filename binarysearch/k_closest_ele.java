package binarysearch;
import java.util.*;
public class k_closest_ele 
{
    static void closest(int[] a,int x,int k)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int st=0,end=a.length-1;
        int lb=a.length;
        while(st<=end)
        {
            if(x<a[0])
            {   
            lb=0;
            break; 
            }
            if(x>a[a.length-1])
           {
              lb=a.length;
              break;
           }
            int mid=st+(end-st)/2;
            if(a[mid]>=x)
            {
                lb=Math.min(lb,mid);
                end=mid-1;
            }
            else st=mid+1;
        }
        System.out.println(lb);
        int i=lb-1,j=lb;
        while(i>=0&&j<a.length-1&&k>0)
        {
            int di=Math.abs(x-a[i]);
            int dj=Math.abs(x-a[j]);
            if(di<=dj)
            {
                al.add(a[i]);
                i--;
            }
            else
            {
                al.add(a[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0)
        {
            al.add(a[j]);
            j++;
            k--;
        }
        while(j==a.length && k>0)
        {
            al.add(a[i]);
            i--;
            k--;
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        closest(a,x,k);
    }
}
