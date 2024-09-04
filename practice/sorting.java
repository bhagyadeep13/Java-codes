package practice;
import java.util.*;
public class sorting 
{
    static void duplicates(int[] a)
    {
       Arrays.sort(a);
       int n=a.length;
       HashSet<Integer> h=new HashSet<>();
       for(int i=0;i<n;i++)
       {
        h.add(a[i]);
       }
       ArrayList<Integer> al=new ArrayList<>(h);
       for(int k=0;k<h.size();k++)
       {
        System.out.print(al.get(k)+" ");
       }
        
    }
    static void selection(int[] a)
    {
        int sum=0;
        int n=a.length;
        for(int k=0;k<n;k++)
            {
                System.out.print(a[k]+" ");
                sum=sum+a[k];
            }
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
         System.out.println(sum-a[n-1]);
         System.out.println(sum-a[0]);
         
    }
    static int whom(int[] a)
    {
        int n=a.length;
        for(int i=1;i<n-1;i++)
        {
            if(a[i-1]<a[i]&&a[i]<a[i+1])
            {
                return i;
            }
        }
        return -1;
    }
    static void insertion(int[] a)
    {
       int n=a.length;
       for(int i=1;i<n;i++)
       {
        int j=i;
        while(j>0&&a[j-1]>a[j])
        {
            int temp=a[j-1];
            a[j-1]=a[j];
            a[j]=temp;
            j--;
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
        System.out.println();
       }
    }
    static void bubble(int[] a)
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            boolean flag=false;
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
             for(int k=0;k<n;k++)
             {
                System.out.print(a[k]+" ");
             }
             if(flag==false)
             {
                return;
             }
             System.out.println();
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
        System.out.println(whom(a));

    }
}
