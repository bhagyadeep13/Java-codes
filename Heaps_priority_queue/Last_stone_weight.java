// 1046. Last Stone Weight

/*You are given an array of integers stones where stones[i] is the weight of the ith stone.
We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.
Return the weight of the last remaining stone. If there are no stones left, return 0. */

/*
Input: stones = [2,7,4,1,8,1]
Output: 1 */
package Heaps_priority_queue;
import java.util.*;
public class Last_stone_weight 
{
    public static int lastStoneWeight(int[] nums)  // T.C -- O(N*LOG(N))
    {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            p.add(nums[i]);
        }
        while(p.size()>1)
        {
            int x=p.remove();
            int y=p.remove();
            if(x!=y) p.add(Math.abs(y-x));
        }
        if(p.size()==1) return p.peek();
        else return 0;
    }
    public static void main(String[] args) 
    {
        int[] a={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(a));
    }
}
