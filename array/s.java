package array;
import java.util.*;
public class s 
{
    static int LongestSubsequence(int[] a)
    {
        int n=a.length;
        HashSet<Integer> h=new HashSet<>();
        int length=0;
        for(int i=0;i<n;i++)
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
                if(no-a[i]>length)
                {
                    length=no-a[i];
                }
            }
        }
        return length;
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
        System.out.println(LongestSubsequence(a));
    }
}
