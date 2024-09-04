package array;

public class sort_zero_one 
{
    public static void main(String[] args) {
        int[] a={0,0,0,1,1,1};
        int n=a.length;
        int i=0,j=n-1;
        for(int k=0;k<n;k++)
        {
        while(i<j)
        {
            if(a[i]==0)
            {
                i++;
            }
            else
            if(a[j]==1)
            {
                j--;
            }
            else
            if(a[i]==1&&a[j]==0)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        }
    }
    for(int k=0;k<n;k++)
    {
        System.out.print(a[k]+" ");
    }
}
}
