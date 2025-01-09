// 781. Rabbits in Forest

/*There is a forest with an unknown number of rabbits. We asked n rabbits "How many rabbits have the same color as you?" and collected the answers in an integer array answers where answers[i] is the answer of the ith rabbit.
Given the array answers, return the minimum number of rabbits that could be in the forest. */

/*Input: answers = [1,1,2]
Output: 5 */

package Greedy;
import java.util.*;
public class Rabbit_In_Forest 
{
    public static int helper(int[] nums)
    {                                       // T.C -- O(N)
        int ans=0;                          // S.C -- O(N)
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]+1))
            {
                int freq=h.get(nums[i]+1);
                h.put(nums[i]+1,freq+1);
            }
            else
                h.put(nums[i]+1,1);
        }
        System.out.println(h);
        for(int ele : h.keySet())
        {
            int freq=h.get(ele);
            int rem = freq%ele;
            int quo = freq/ele;
            ans=ans+(quo*ele);
            if(rem!=0)
            ans=ans+ele;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] nums={1,1,2};
        System.out.println(helper(nums));
    }
}
