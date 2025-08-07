package Advance_sorting;

/*Count Inversions
Difficulty: MediumAccuracy: 16.93%Submissions: 685K+Points: 4
Given an array of integers arr[]. You have to find the Inversion Count of the array. 
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].
 */
public class count_invertions 
{
    static int count;
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

        int k=0,l=0;
        while(k<a1.length && l<a2.length) // invertions count kar rhe har levels pe 
        { 
            if((long)a1[k]>(long)(2*a2[l]))
            {
                count = count + a1.length - k;
                l++;
            }
            else 
            k++;
        }
        //merging 
        merge(a1,a2,a);

        a1=null ; // means deleting the array after it returns to reduce space complexity 
        a2=null;
    }
    public static void main(String[] args) 
    {
        count=0;
        int[] a = {1,3,2,3,1};
        mergeSort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(count);
    }
}
