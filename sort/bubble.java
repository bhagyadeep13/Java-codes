package sort;
import java.util.*;
public class bubble
{
    static void bubblesort(int[] a)
    {
       int n=a.length;
       boolean flag=false;
       for(int i=0;i<n-1;i++)
       {
           for(int j=0;j<n-i-1;j++)
           {
              if(a[j]>a[j+1])
              {
                 int temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
                 flag=true;
              }
           }
           if(flag==false)
           {
            break;
           }
       }
       for(int j=0;j<a.length;j++)
           {
            System.out.print(a[j]+" ");
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

