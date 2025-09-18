package Sorting_techniques;
import java.util.*;;
public class selection_sort 
{
    public static void main(String[] args) 
    {
        int[] a={3,5,2,1,7,4,6,7,8,9};

        for(int i=0;i<a.length;i++)
        {
            int min = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
