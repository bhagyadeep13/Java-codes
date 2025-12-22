package Inteview_questions.Capgemeni;

public class k 
{
    public static void reverse(int i,int j,int[] a)
    {
        while(i<j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] a={1,3,5};
        int k=2;
        int n=a.length;
        k=k%a.length;
        reverse(0, n-k-1, a);  
        reverse(n-k, n-1, a);
        reverse(0, n-1, a);
        // reverse(0, k-1,a); for anticlockwise rotation
        // reverse(k, n-1,a);
        // reverse(0, n-1,a);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
