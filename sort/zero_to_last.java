package sort;
import java.util.*;
public class zero_to_last 
{
    static void bubblesort(int[] a)
    {
        int n=a.length;
        int i=0;
        while(i<n-1)
        {
        for(int l=0;l<n-i-1;l++)
        {
            if(a[l]==0&&a[l+1]!=0)
            {
                int temp=a[l];
                a[l]=a[l+1];
                a[l+1]=temp;
            }
        }
        i++;
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
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        bubblesort(a);
    }
}


