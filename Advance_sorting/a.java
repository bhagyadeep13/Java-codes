package Advance_sorting;

public class a 
{
    public static void swap(int[] a,int a1,int b1)
    {
        int temp = a[a1];
        a[a1] = a[b1];
        a[b1] = temp;
    }

    public static void helper(int[] a,int st,int end)
    {
        if(st>=end) return;
        int mid = (st+end)/2;
        int pivotVal = a[mid];
        int count=0;
        for(int i=st;i<=end;i++)
        {
            if(a[i]<=pivotVal) count++;
        }
        int correctIdx = st + count;
        swap(a, mid, correctIdx);

        int i=st,j=end;
        while(i<correctIdx && j>correctIdx)
        {
            if(a[i]<=pivotVal) i++;
            if(a[j]>pivotVal) j--;
            if(a[i]>pivotVal && a[j]<=pivotVal) 
            {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        helper(a, st, correctIdx-1);
        helper(a, correctIdx+1, end);
    }
    public static void main(String[] args) 
    {
        int[] a = {2,5,7,3,4,20,68,90,40};
        helper(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
