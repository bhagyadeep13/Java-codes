// Minimum Cost of ropes

// Given an array, arr[] of rope lengths, connect all ropes into a single rope with the minimum total cost. The cost to connect two ropes is the sum of their lengths. 

/*Input: arr[] = [4, 3, 2, 6]
Output: 29
 */

package Heaps_priority_queue;
import java.util.*;
public class Min_cost_rope 
{
    public static int minCost(int[] arr) // T.C -- (N*LOG(N))
    {
        PriorityQueue<Integer> p=new PriorityQueue<>(); // make min heap
        int cost=0;
        for(int i=0;i<arr.length;i++) // add the elements of Arr in min heap
        {
            p.add(arr[i]);
        }
        while(p.size()>1)  // Now remove two min ele from heap and add sum of two
        {                   // repeat this jab ta ki p.size()>1 
            int x=p.remove();
            int y=p.remove();
            p.add(x+y);
            cost=cost+(x+y);
        }
        return cost;
    }
    public static void main(String[] args) 
    {
        int[] a={4, 3, 2, 6};
        System.out.println(minCost(a));
    }
}
