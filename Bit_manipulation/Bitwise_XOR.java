// 2425. Bitwise XOR of All Pairings

/*You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers. There exists another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once).
Return the bitwise XOR of all integers in nums3. */

package Bit_manipulation;
import java.util.*;
public class Bitwise_XOR 
{
    public static int xorAllNums(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length; 
        int ans=0;          // XORing an odd number of times leaves the original value.
        if(n%2==1)
        {
            for(int i=0;i<m;i++)
            {
                ans=ans^nums2[i];
            }
        }
        if(m%2==1)
        {
            for(int j=0;j<n;j++)
            {
                ans=ans^nums1[j];
            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] nums1={2,1,3};
        int[] nums2={10,2,5,0};
        System.out.println(xorAllNums(nums1, nums2));
    }
}
