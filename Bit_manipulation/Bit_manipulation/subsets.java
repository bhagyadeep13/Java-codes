package Bit_manipulation;
import java.util.*;
public class subsets 
{
    public static void main(String[] args) {
        int[] nums={1,2,2};
        int n=nums.length;
        int subsets = 1<<n;                       // T.C -- O(POW(2,N)*N)
        List<List<Integer>> all=new ArrayList();
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
    }
}
