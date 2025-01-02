// 46. Permutations

/*Given an array nums of distinct integers, return all the possible 
permutations
. You can return the answer in any order. */

/*Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]] */

package Backtracking;
import java.util.*;
public class Premutations 
{
    public static void helper(List<List<Integer>> all,List<Integer> al,int[] nums)
    {                                             // T.C -- O(N!)
        if(al.size()==nums.length)
        {
            List<Integer> l=new ArrayList<>(al);
            all.add(l);
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(al.contains(nums[i]))  // handle the duplicates permutations
            {                        // (means list me sabhi ele unique honge)
                continue;
            }
            al.add(nums[i]);
            helper(all, al, nums);
            al.remove(al.size()-1);
        }
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3};
        List<List<Integer>> all=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        helper(all, al, a);
        System.out.println(all);
    }
}
