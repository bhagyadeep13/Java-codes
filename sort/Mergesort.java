package sort;
import java.util.*;
public class Mergesort 
{
    static void display(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void  merge(int[] a,int l,int mid,int r )
    {
        int n1= mid-l+1;
        int n2= r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++)
        {
            left[i]=a[l+i];
            
        }
        for(j=0;j<n2;j++)
        {
            right[j]=a[mid+1+j];
        }
         i=0;
         j=0;
         k=l;
        while(i<n1&&j<n2)
        {
            if(left[i]<right[j])
            a[k++]=left[i++];
            else
            a[k++]=right[j++];

        }
             while(j<n2)
             {
                a[k++]=right[j++];
             }
            while(i<n1)
            {
                a[k++]=left[i++];
            }
            display(a);
        }
    static int[]  mergesort(int[] a,int l,int r)
    {
        int mid=(l+r)/2;
        if(l>=r)
        {
            return a;
        }
        mergesort(a, l, mid);
        mergesort(a, mid+1, r);
        merge(a,l,mid,r);
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        display(a);
        System.out.println("Array after sorting");
        mergesort(a,0,n-1);
       
    }
}
