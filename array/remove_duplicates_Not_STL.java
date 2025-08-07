
package array;
import java.util.*;
public class remove_duplicates_Not_STL 
{
    public static int removeDuplicates(int[] arr, int n) 
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    for(int k=j;k<n-1;k++)
                    {
                        arr[k] = arr[k+1];
                    }
                    n--;
                    i--;  // again rechecking used in case three duplicates consecutive
                    break;
                }
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
