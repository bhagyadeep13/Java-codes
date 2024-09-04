package sort;
import java.util.*;
public class String_arr_lexographic_order
{
        static void lexo(String[] a)
        {
            int n=a.length;
            for(int i=0;i<n-1;i++)
            {
                int min=i;
                for(int j=i+1;j<n;j++)
                {
                    if(a[j].compareTo(a[min])<0)
                    {
                        min=j;

                        
                    }
                }
                String temp=a[i];
                a[i]=a[min];
                a[min]=temp;
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
        String[] a=new String[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.next();
        }
        lexo(a);

    }
    
}

