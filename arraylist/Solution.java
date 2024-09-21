package arraylist;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    public static int helper(int n,int k)
    {
        int count=0;
        int s=n;
        while(n<=k)
        {
            n=n+s;
            count++;
        }
        return count;
    }
    public static int helper2(int n1,int n2,int[] a)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            count=count+helper(a[i],n2);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n1,n2;
        while(t>0)
        {   
            n1=sc.nextInt();
            n2=sc.nextInt();
            int[] a=new int[n1];
            for(int i=0;i<n1;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println(helper2(n1,n2,a));
            t--;
        }
    }
}
