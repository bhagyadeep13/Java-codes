// 1248. Count Number of Nice Subarrays

/*Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
Return the number of nice sub-arrays.
 */

/*Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1]. */

package sliding_window;
import java.util.*;
public class count_nice_subarrays 
{
    public static int numberOfSubarrays(int[] nums, int k) // METHOD 1(sliding window)
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]%2;
        }
        int i=0,j=0,a=0,b=0,k2=0,n=nums.length,count=0;
        while(i<n && nums[i]==0) i++;
        while(k2<k)
        {
            if(nums[j]==1) k2++;
            j++;
        }
        if(k2<k) return 0;
        j--;
        b=j+1;
        while(b<n && nums[b]==0) b++;
        b--;
        while(b<n)
        {
            count=count+((i-a+1)*(b-j+1));
            a=i+1;
            i++;
            while( i<n && nums[i]==0) i++;
            j=b+1;
            b=j+1;
            while(b<n && nums[b]==0) b++;
            b--;
        }
        return count;
    }

    public static int nice(int[] nums,int k)  // METHOD 2(prefix sum)
    {
        int n=nums.length;
        for(int i=0;i<nums.length;i++) // converting to binary array
        {
            nums[i]=nums[i]%2;
        }
        for(int i=1;i<nums.length;i++)   // prefix sum array
        {
            nums[i]=nums[i]+nums[i-1];
        }
        HashMap<Integer,Integer> h=new HashMap<>(); // use hashmap to store the firstindex of each element
        int a=0,b=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!h.containsKey(nums[i]))
            {
                h.put(nums[i],i);
            }
            if(nums[i]==k)      // if(nums[i]==k) count the no of nice subarray
            {
                if(h.containsKey(nums[i]-k))
                a=h.get(nums[i]-k);
                b=h.get(nums[i]-k+1);
                count=count+b-a+1;
            }
            else
            if(nums[i]>k)   // if(nums[i]>k) count the no of nice subarray
            {
                a=h.get(nums[i]-k);
                b=h.get(nums[i]-k+1);
                count=count+b-a;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] a={2,2,2,1,2,2,1,2,2,2};
        System.out.println(numberOfSubarrays(a,2));
    }
}
