package Sorting_techniques;

public class bubbleSort 
{
    public static void helper(int[] a)
    {
        int n= a.length;
        for(int i=0;i<n-1;i++)
        {
            boolean flag=false;
            for(int j=0;j<n-i-1;j++) // last i elements are sorted 
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag=true;
                }
            }
            if(flag==false) break;
        }
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,6};
        helper(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
