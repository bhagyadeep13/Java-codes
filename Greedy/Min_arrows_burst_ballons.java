// 452. Minimum Number of Arrows to Burst Balloons

/*There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.
Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array points, return the minimum number of arrows that must be shot to burst all balloons. */
package Greedy;
import java.util.*;
public class Min_arrows_burst_ballons 
{
    public static void helper(int[][] a,List<List<Integer>> all)
    {
        for(int i=0;i<a.length;i++)
        {
            List<Integer> al=new ArrayList<>();
            if(all.size()==0 || all.get(all.size()-1).get(1)<a[i][0])
            {
                al.add(a[i][0]);
                al.add(a[i][1]);
                all.add(al);
            }
            else
            {
                int st=Math.max(all.get(all.size()-1).get(0),a[i][0]);
                all.get(all.size()-1).set(0,st);
                
                int end=Math.min(a[i][1],all.get(all.size()-1).get(1));
                all.get(all.size()-1).set(1,end);
            }
        }
    }
    public static void main(String[] args) 
    {
        int[][] a={{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(a,(a1,a2) -> a1[0]-a2[0]);
        List<List<Integer>> all=new ArrayList<>();
        helper(a,all);
        System.out.println(all.size());
    }
}
