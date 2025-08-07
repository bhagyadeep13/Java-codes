package Bit_manipulation;
import java.util.*;
public class subsets 
{
    public static List<List<Integer>> subsetsWithDup(int[] nums)  // My method 
    {
        int n=nums.length;                    // T.C -- O(N*POW(2,N))
        int subsets = 1<<n;
        List<List<Integer>> all=new ArrayList<>();
        for(int i=0;i<subsets;i++)
        {
            List<Integer> al=new ArrayList<>();
            StringBuilder s = new StringBuilder(Integer.toString(i,2));
            s.reverse();
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='1')
                {
                    al.add(nums[j]);
                }
            }
            all.add(al);
        }
        return all;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2};
        int n=nums.length;
        int subsets = 1<<n;                       // T.C -- O(POW(2,N)*N)
        List<List<Integer>> all= new ArrayList();
        for(int i=0;i<subsets;i++)
        {
            List<Integer> al=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                int mask = 1<<j;
                if((mask & i)!=0) al.add(nums[j]);
            }
            all.add(al);
        }
        System.out.println(all);

        System.out.println(subsetsWithDup(nums));
    }
}
