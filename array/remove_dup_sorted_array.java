package array;

public class remove_dup_sorted_array 
{
    public static int removeDuplicates(int[] arr,int n) // Best Case -- O(N)
    {                                                   // worst Case -- O(N)
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                for(int j=i+1;j<n-1;j++)
                {
                    arr[j] = arr[j+1];
                }
                i--;
                n--;
            }
        }
        return n;
    }
    public static void main(String[] args) 
    {
        int[] a= {0,0,0,1,1,2,2,3,3,4};
        int len = removeDuplicates(a, a.length);
        for(int i=0;i<len;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
