package HashSet_HashMaps;
import java.util.*;
public class two_sum 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        int[] a=new int[2];
        a[0]=-1;
        a[1]=-1;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int remain=target-nums[i];
            if(h.containsKey(remain))
            {
                a[1]=h.get(remain);
                a[0]=i;
                return a;
            }
            else
            {
                h.put(nums[i],i);
            }
        }
        return a;
    }
    public static void main(String[] args) 
    {
        int[] a={2,7,11,15};
        int target=9;
        int[] ans= twoSum(a,target);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
