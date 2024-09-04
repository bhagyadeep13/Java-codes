package sort;
import java.util.*;
public class Insertion
{
    static void insertionsort(int[] a)
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
          int j=i;
          boolean flag=false;
          while(j>0&&a[j]<a[j-1])
          {
            int temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            j--;
            flag=true;
          }
          for(int k=0;k<n;k++)
          {
            System.out.print(a[k]+" ");
          }
          if(flag!=true)
          {
            return;
          }
          System.out.println();
        }
        for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
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
        insertionsort(a);
    }
}