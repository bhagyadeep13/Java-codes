package array;
import java.util.*;
public class LargestSubsequence 
{
    static void Largestsequence(int[] a)
    {
        int n=a.length;
        int length=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            h.add(a[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(!h.contains(a[i]-1))
            {
                int no=a[i];
                while(h.contains(no))
                {
                    no++;
                }
                if(length<no-a[i])
                {
                    length=no-a[i];
                }
            }
        }
        System.out.println(length);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Largestsequence(a);
    }
}
