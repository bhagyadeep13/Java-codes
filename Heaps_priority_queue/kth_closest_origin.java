// 973. K Closest Points to Origin

/*Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in). */

package Heaps_priority_queue;
import java.util.*;
public class kth_closest_origin 
{
    public static class Triplet implements Comparable<Triplet>
    {
        int d;
        int x;
        int y;
        Triplet(int d,int x,int y)
        {
            this.d=d;
            this.x=x;
            this.y=y;
        }
        public int compareTo(Triplet t)
        {
            return this.d-t.d;
        }

    }
    public static int[][] helper(int[][] a,int k)
    {
        PriorityQueue<Triplet> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++)
        {
            int x=a[i][0];
            int y=a[i][1];
            int d=x*x + y*y;
            p.add(new Triplet(d, x, y));
            if(p.size()>k)
            {
                p.remove();
            }
        }
        int[][] ans=new int[k][2];
        int val=p.size();
        for(int i=0;i<val;i++)
        {
            Triplet pa=p.remove();
            int x=pa.x;
            int y=pa.y;
            ans[i][0]=x;
            ans[i][1]=y;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[][] a={{3,3},{5,-1},{-2,4}};
        int k=2;
        int[][] ans = helper(a,k);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.println(ans[i][j]+" ");
            }
        }
    }
}
