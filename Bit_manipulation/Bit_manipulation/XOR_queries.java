// 1310. XOR Queries of a Subarray

/*You are given an array arr of positive integers. You are also given the array queries where queries[i] = [lefti, righti].
For each query i compute the XOR of elements from lefti to righti (that is, arr[lefti] XOR arr[lefti + 1] XOR ... XOR arr[righti] ).
Return an array answer where answer[i] is the answer to the ith query. */

package Bit_manipulation;
import java.util.*;
public class XOR_queries 
{
    public static void xorQueries(int[] arr, int[][] q)  // T.C -- O(M+N)
    {
        int[] ans=new int[q.length];
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]^arr[i];
        }
        for(int i=0;i<q.length;i++)
        {
            int st=q[i][0];
            int end=q[i][1];
            if(st!=0)
            ans[i] = prefix[st-1] ^ prefix[end];
            else
            ans[i] = prefix[end];
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int[] a={1,3,4,8};
        int[][] q={{0,1},{1,2},{0,3},{3,3}};
        xorQueries(a, q);;
    }
}
