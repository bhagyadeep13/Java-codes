// 1109. Corporate Flight Bookings

// There are n flights that are labeled from 1 to n.
//You are given an array of flight bookings bookings, where bookings[i] = [firsti, lasti, seatsi] represents a booking for flights firsti through lasti (inclusive) with seatsi seats reserved for each flight in the range.
//Return an array answer of length n, where answer[i] is the total number of seats reserved for flight i.

// SAMPLE
// Input: bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
// Output: [10,55,45,25,25]

package PrefixSum;
import java.util.*;
public class Corporate_flights 
{
    public static void helper(int f,int l,int val,int[] a,int n)
    {
            a[f-1]=a[f-1]+val;
            if(l<a.length) a[l]=a[l]-val;
    }
    public static void main(String[] args) 
    {
        int n=5;
        int[] ans=new int[n];
        int[][] a={{1,4,10},{2,3,20},{2,5,25}};
        for(int i=0;i<a.length;i++)             // Treversing the 2D array
        {
            int first=a[i][0];
            int last=a[i][1];
            int val=a[i][2];
            helper(first,last,val,ans,n);       
        }
        for(int i=1;i<ans.length;i++)    // Prefix sum of the array
        {
            ans[i]=ans[i-1]+ans[i];
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
