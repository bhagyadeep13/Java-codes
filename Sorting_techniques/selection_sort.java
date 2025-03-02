package Sorting_techniques;
import java.util.*;;
public class selection_sort 
{
    public static void helper(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min=Integer.MAX_VALUE;
            int minIdx=-1;
            boolean flag=false;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    minIdx=j;
                    flag=true;
                }
            }
            if(flag==true)
            {
            int temp=a[i];
            a[i]=a[minIdx];
            a[minIdx]=temp;
            }
            for(int k=0;k<a.length;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int[] a={3,5,2,1,4};
        helper(a);

    }
}
