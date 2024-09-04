/* Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
package sliding_window;

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3

Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).*/


package sliding_window;
import java.util.*;

public class leetcode_1343 
{
    public static int numOfSubarrays(int[] arr, int k, int t)   // T.C -- O(N)
    {
        int i=0,j=k-1,count=0,sum=0;
        for(int a=i;a<=j;a++)  // k times
        {
            sum=sum+arr[a];
        }
        int avg = sum/k;
        i++;
        j++;
        if(avg >= t) count++;
        while(j<arr.length)  // n-k times
        {
            sum=sum+arr[j]-arr[i-1];
            avg = sum/k;
            if(avg >= t)
            count++;
            i++;
            j++;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] nums={2,2,2,2,5,5,5,8};
        int t=4;
        int k=3;
        System.out.println(numOfSubarrays(nums, k, t));
    }
}
