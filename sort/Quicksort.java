package sort;
import java.util.*;
public class Quicksort 
{
    static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void display(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
             System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static int partition(int[] a,int st,int end)
    {
        int pivot=a[st];
        int ele=0;
        for(int i=st+1;i<=end;i++)
        {
            if(a[i]<=pivot)
            ele++;
        }
        int pivotidx=st+ele;
        swap(a, st, pivotidx);
        int i=st,j=end;
        while(i<pivotidx&&j>pivotidx)
        {
            while(a[i]<=a[pivotidx])
            {
                i++;
            }
            while(a[j]>a[pivotidx])
            {
                j--;
            }
            if(i<pivotidx&&j>pivotidx)
            {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        return pivotidx;
    }
    static void quicksort(int[] a,int st,int end)
    {
        if(st>=end)
        {
            return;
        }
        int pi=partition(a, st, end);
        quicksort(a,st,pi-1);
        quicksort(a, pi+1, end);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array before sorting");
        display(a);
        System.out.println("Array after sorting");
        quicksort(a, 0, a.length-1);
        display(a);
    }
    
}
