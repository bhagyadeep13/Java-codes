// 2406. Divide Intervals Into Minimum Number of Groups

/*You are given a 2D integer array intervals where intervals[i] = [lefti, righti] represents the inclusive interval [lefti, righti].
You have to divide the intervals into one or more groups such that each interval is in exactly one group, and no two intervals that are in the same group intersect each other.
Return the minimum number of groups you need to make.
Two intervals intersect if there is at least one common number between them. For example, the intervals [1, 5] and [5, 8] intersect. */

/*Example 1:
Input: intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]]
Output: 3 */

package Leetcode_IMP.HashMaps;
import java.util.*;
public class Leetcode_2406      // TIME COMPLEXITY -- O(N*(LOG^N))
{
    public static int minGroups(int[][] it) 
    {
        int n=it.length;
        int[] st=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++)
        {
            st[i]=it[i][0];
            end[i]=it[i][1];
        }
        Arrays.sort(st);
        Arrays.sort(end);
        int  str=0, en=0;
        for(int ele : st)
        {
            if(ele > end[str])
            str++;
            else
            en++;
        }
        return en;
    }
    public static void main(String[] args) 
    {
        int[][] a={{5,10},{6,8},{1,5},{2,3},{1,10}};
        System.out.println(minGroups(a));
    }
}
