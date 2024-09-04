// 1493. Longest Subarray of 1's After Deleting One Element

/*Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
*/

/*  Input: nums = [1,1,0,1]
    Output: 3 */
    
package sliding_window;
import java.util.*;
public class delete_one 
{

    public static int helper(int[] a)
    {
        int i=0,j=0,zero=0;
        int max=Integer.MIN_VALUE;
        int z=0;
        for(int ele : a)
        {
            if(ele==0) z++;
        }
        if(z==0) return a.length-1;   // all elements are zero in the array
        while(i<a.length && a[i]==0)  // i move to first one
        {
            i++;
        }
        j=i;
        while(j<a.length)
        {
            if(a[j]==1) j++;
                else                // a[j]==0
                {
                    if(zero==0 || zero==1)
                    {
                        j++;
                        zero++;
                    }
                    else   // zero==1
                    {
                        int len=j-i-1;
                        max=Math.max(len,max);
                        zero--;
                        while(i<a.length && a[i]==1)
                        {
                            i++;
                        }
                        i++;
                        j=i;
                    }
                }
        }
        if(zero==0) return j-i;  // for 0011 test case
        int len=j-i-1;
        max=Math.max(len,max);
        return max;
    }
    public static void main(String[] args) 
    {
        int[] a={0,1,1,1,0,1,1,0,1};
        System.out.println(helper(a));
    }
}
