package Inteview_questions.Capgemeni;
import java.util.*;
public class d 
{
    public static int helper(int[] a)
    {
        int size=a.length;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(a[i]==a[j])
                {
                    for(int k=j+1;k<size;k++)
                    {
                        a[k-1] = a[k];
                    }
                    size--;
                    j--;
                }
            }
        }
        return size;
    }
    public static void main(String[] args) {
        int[] a={3,1,1,2};
        int m = helper(a);
        int[] b = {4,3,3,2,1};
        int n = helper(b);
        int[] a1 = new int[m+n];
        int z=0;
        for(int i=0;i<m;i++)
        {
            a1[z] = a[i];
            z++;
        }
        for(int i=0;i<n;i++)
        {
            a1[z] = b[i];
            z++;
        }
        Arrays.sort(a1);
        for(int i=0;i<a1.length;i++)
        {
            System.out.print(a1[i]+" ");
        }
        System.out.println();
        if(a1.length%2==0)
        {
            int val1 = a1[a1.length/2];
            int val2 = a1[(a1.length/2)+1];
            System.out.println((val1+val2)/2);
        }
        else
        {
            System.out.println(a1[a1.length/2]);
        }
    }
}
