
// 904. Fruit Into Baskets

/*You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick. */

/*Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees. */

package sliding_window;
import java.util.*;
public class fruit_baskets 
{
    public static int totalFruit(int[] f) 
    {
        int n=f.length;
        int max=Integer.MIN_VALUE;
        int i=0,j=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        while(j<n)
        {
            if(h.containsKey(f[j]))   // hashmap me freq badha rhe h
            {
                int freq=h.get(f[j]);
                h.put(f[j],freq+1);
            }
            else
                h.put(f[j],1);

            while(h.size()>2)          // agar length > 2 toh ye karo
            {
                int freq=h.get(f[i]);
                if(freq==1) h.remove(f[i]);
                else h.put(f[i],freq-1);
                i++;
            }
            int len=j-i+1;          // length and maxlen nikal rhe h
            max=Math.max(max,len);
            j++;
        }
        return max;
    }
    public static int fruit(int[] nums)
    {
        int n=nums.length;
        int i=0,j=0;
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> h=new HashMap<>();
        while(j<n)
        {
            if(h.containsKey(nums[j]))
            {
                int freq=h.get(nums[j]);
                h.put(nums[j],freq+1);
            }
            else
                h.put(nums[j],1);
            while(h.size()>2)
            {
                int freq=h.get(nums[i]);
                if(freq==1) h.remove(nums[i]);
                else h.put(nums[i],freq-1);
                i++;
            }
            int len=j-i+1;
            max=Math.max(len,max);
            j++;
        }
        return max;
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,2,2};
        System.out.println(totalFruit(a));
        System.out.println(fruit(a));
    }
}
