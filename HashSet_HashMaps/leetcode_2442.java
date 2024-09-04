
    // Count Number of Distinct Integers After Reverse Operations
    
package HashSet_HashMaps;
import java.util.*;
public class leetcode_2442 
{
    public static int rev(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        int[] nums={1,13,10,12,31};
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
            s.add(rev(nums[i]));
        }
       System.out.println(s.size());
    }
}

