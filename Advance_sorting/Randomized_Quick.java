package Advance_sorting;

public class Randomized_Quick 
{
    public static void swap(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    // Best Case 
    public static void Quicksort(int[] a,int st,int end)
    {
        if(st>=end) return;  // array size 1 or less than 1
        int mid = (st + end)/2;
        int val = a[mid];
        int smallCount = 0;        // to count the number of smaller and equal element from val;
        for(int i=st;i<=end;i++)
        {
            if(i==mid) continue;

            if(a[i]<=val)
            {
                smallCount++;
            }
        }
        int Correctidx = smallCount+st;

        swap(a, mid, Correctidx);

        int i=st,j=end;
        while(i<Correctidx && j>Correctidx)
        {
            if(a[i]<=val) i++;
            if(a[j]>val) j--;
            if(a[i]>val && a[j]<=val) 
            {
                swap(a, i, j);
                i++; j--;
            }
        }
        
        Quicksort(a, st, Correctidx-1);
        Quicksort(a, Correctidx+1, end);
    }
    public static void main(String[] args) 
    {
        int[] a={5,9,10,45,6,8,7};
        Quicksort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
