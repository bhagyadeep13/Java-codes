package array;
import java.util.*;
public class k 
{
    static void largest(int[] a,int k)
    {
       int n=a.length;
       for(int i=0;i<n-1;i++)
       {
          for(int j=i+1;j<n;j++)
          {
            if(a[i]<a[j])
            {
              int temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
          }
          if(i==k-1)
          {
            System.out.print(a[i]);
            return;
          }
       }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        largest(a, k);
        
    }
}
