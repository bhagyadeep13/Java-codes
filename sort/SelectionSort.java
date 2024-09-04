package sort;
import java.util.*;
public class SelectionSort
{
    static void selection(int[] a)
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
      {
        int min=i;
        for(int j=i+1;j<n;j++)
        {
            if(a[j]<a[min])
            {
                min=j;
            }
        }
        int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        for(int k=0;k<n;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println();
    
    }
    for(int k=0;k<n;k++)
            {
                System.out.print(a[k]+" ");
            }
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
        selection(a);
    }
}











        