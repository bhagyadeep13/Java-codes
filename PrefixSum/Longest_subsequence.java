// 2389. Longest Subsequence With Limited Sum

/*  You are given an integer array nums of length n, and an integer array queries of length m.
Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].
A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.*/

package PrefixSum;
import java.util.*;
public class Longest_subsequence 
{
    public static int count(int[] a,int k)    // Prefix sum property- jis element pe khade h apan toh voh idx+1 size ka subsequence present h array me jiska sum k ya k se chota h
    {
        int max=0,st=0,end=a.length-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]>k) end=mid-1;
            else
            {
                max=Math.max(max,mid+1);
                st=mid+1;
            }
        }
        return max;
    }
    public static void segregateElements(int[] arr,int[] q) 
    {
        Arrays.sort(arr); 
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        for(int i=0;i<q.length;i++)
        {
            q[i]=count(arr, q[i]);
        }
        for(int i=0;i<q.length;i++)
        {
            System.out.print(q[i]+" ");
        }
    }

    public static void main(String[] args) 
    {
        int[] a={4,5,2,1};
        int[] q={3,10,21};
        segregateElements(a,q);
    }
}

