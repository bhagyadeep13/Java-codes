package array;
import java.util.*;
public class sort_even_odd 
{
    static int[] even(int[] a)
    {
        int n=a.length;
        int l=0,k=n-1;
       while(l<k)
       {
           if(a[l]%2==0)
           {
            l++;
           }
           else
           if(a[k]%2!=0)
           {
             k--;
           }
           else
           {
            if(a[l]%2!=0&&a[k]%2==0)
            {
               int temp=a[l];
               a[l]=a[k];
               a[k]=temp;
               l++;
               k--;
            }
           }
        }
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
        int[] res=even(a);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
    
}
