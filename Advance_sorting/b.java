package Advance_sorting;

public class b 
{
    public static void merge(int[] a,int[] b,int[] c) // merge two array
    {
        int i=0;
        int j=0;
        int z=0;
        while(i<a.length && j<b.length)
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
        while(i<a.length)
        {
            c[z] = a[i];
            i++;
            z++;
        }
        while(j<b.length)
        {
            c[z] = b[j];
            j++;
            z++;
        }
    }
    public static void helper(int[] a)
    {
        int n = a.length;
        int mid = n/2;
        if(n<=1) return;

        int[] one = new int[mid];
        int[] two = new int[n-mid];

        for(int i=0;i<mid;i++)
        {
            one[i] = a[i];
        }
        for(int i=0;i<n-mid;i++)
        {
            two[i] = a[i+mid];
        }


        helper(one);
        helper(two);

        merge(one,two,a);

    }
    public static void main(String[] args) 
    {
        int[] a={3,4,68,93,20,10,30};
        helper(a);
        
        
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
