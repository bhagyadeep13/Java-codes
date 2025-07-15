package array;

public class practice 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,3,4,3,5,3};
        int i=0;
        int j=a.length-1;
        while(i<=j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
