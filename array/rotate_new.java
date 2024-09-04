package array;
import java.util.*;

public class rotate_new 
{
     static void reverse(int[] nums,int i,int j)
{
    while(i<=j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
}
}
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        k=k%n;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
            
            reverse(a,0,n-k-1);
            reverse(a,n-k,n-1);
            reverse(a,0,n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }


