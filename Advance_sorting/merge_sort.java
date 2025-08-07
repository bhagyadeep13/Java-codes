package Advance_sorting;

public class merge_sort 
{
    public static void merge(int[] a,int[] b,int[] c)
    {
        int m=a.length;
        int n=b.length;
        int i=0;
        int j=0;
        int z=0;
        while(i<m && j<n)
        {
            if(a[i]<=b[j])
            {
                c[z]=a[i];
                z++;
                i++;
            }
            else
            {
                c[z] = b[j];
                z++;
                j++;
            }
        }
        while(i<m)
        {
            c[z] = a[i];
            z++;
            i++;
        }
        while(j<n)
        {
            c[z] = b[j];
            z++;
            j++;
        }
    }
    public static void mergeSort(int[] a)
    {
        int n = a.length;

        if(n<=1) return;

        int mid = n / 2;

        int[] a1 = new int[n/2];
        int[] a2= new int[(n-mid)];
    
        // ✅ Correct copying
        for (int i = 0; i < mid; i++)
            a1[i] = a[i];
        for (int i = 0; i < n - mid; i++)
            a2[i] = a[i + mid];

        // magic 
        mergeSort(a1);
        mergeSort(a2);

        //merging 
        merge(a1,a2,a);

        a1=null ; // means deleting the array after it returns to reduce space complexity 
        a2=null;
    }
    public static void main(String[] args) 
    {
        int[] a = {2,3,4,5,6};
        mergeSort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
