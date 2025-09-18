package Sorting_techniques;

public class InsertionSort 
{
    public static void main(String[] args) 
    {
        int[] a={2,3,45,2,7,9,7};
        int n = a.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && a[j]<a[j-1])
            {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
