// 881. Boats to Save People

/*You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
Return the minimum number of boats to carry every given person. */

/*Input: people = [1,2], limit = 3
Output: 1 */

package Greedy;
import java.util.*;
public class Boats_to_save_people 
{
    public static int numRescueBoats(int[] p, int l) 
    {
        int i=0,j=p.length-1;
        int boats=0;
        Arrays.sort(p);
        while(i<=j)
        {
            if(p[i]+p[j]<=l)
            {
                i++;
                j--;
            }
            else
            j--;
            boats++;
        }
        return boats;
    }
    public static void main(String[] args) 
    {
        int[] nums={3,2,2,1};
        int l=3;
        System.out.println(numRescueBoats(nums, l));
    }
}
