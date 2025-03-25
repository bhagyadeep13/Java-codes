// 435. Non-overlapping Intervals

/*Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
Note that intervals which only touch at a point are non-overlapping. For example, [1, 2] and [2, 3] are non-overlapping. */
package Greedy;
import java.util.*;
public class non_overlapping_int 
{
    public static void helper(int[][] a,List<List<Integer>> all)
    {
        for(int i=0;i<a.length;i++)                     // T.C-- O(N*LOG(N))
        {
            List<Integer> al=new ArrayList<>();
            int n=all.size()-1;
            if(all.size()==0 || all.get(n).get(1)<=a[i][0])
            {
                al.add(a[i][0]);
                al.add(a[i][1]);
                all.add(al);
            }
            else
            {
                int st = Math.max(all.get(n).get(0),a[i][0]);
                all.get(n).set(0,st);

                int end = Math.min(all.get(n).get(1),a[i][1]);
                all.get(n).set(1,end);
            }
        }
    }
    public static void main(String[] args) 
    {
        int[][] a={{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(a,(a1,a2) -> a1[0]-a2[0]);
        List<List<Integer>> all=new ArrayList<>();
        helper(a,all);
        System.out.println(all);
        System.out.println(a.length-all.size());  // minimum no. of intervals to remove

    }
}
