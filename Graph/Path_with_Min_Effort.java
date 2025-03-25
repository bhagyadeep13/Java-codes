// 1631. Path With Minimum Effort

/*You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns, where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find a route that requires the minimum effort.
A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
Return the minimum effort required to travel from the top-left cell to the bottom-right cell. */

/*Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
Output: 2 */

package Graph;
import java.util.*;
public class Path_with_Min_Effort 
{
    static class Triplet implements Comparable<Triplet>
    {
        int row;
        int col;
        int dis;
        Triplet(int row,int col,int dis)
        {
            this.row=row;
            this.col=col;
            this.dis=dis;
        }
        public int compareTo(Triplet t)
        {
            return Integer.compare(this.dis, t.dis);
        }
    }
    public static void main(String[] args) // USING DIJKSTRA ALGORITHM
    {
        int[][] h={{1,2,2},{3,8,2},{5,3,5}};
        int m=h.length;
        int n=h[0].length;
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[i][j]=Integer.MAX_VALUE;
            }
        }
        ans[0][0]=0;
        PriorityQueue<Triplet> p=new PriorityQueue<>();
        p.add(new Triplet(0, 0, 0));
        while(p.size()>0)
        {
            Triplet front = p.remove();
            int row=front.row;
            int col=front.col;
            int dis=front.dis;
            if(row==m-1 && col==n-1) break;
                if(row<m-1)
                {
                    int newdis=Math.abs(h[row+1][col]-h[row][col]);
                    newdis = Math.max(newdis,dis);
                    if(ans[row+1][col]>newdis)
                    {
                        ans[row+1][col]=newdis;
                        p.add(new Triplet(row+1, col, newdis));
                    }
                }
                if(col<n-1)
                {
                    int newdis=Math.abs(h[row][col+1]-h[row][col]);
                    newdis = Math.max(newdis,dis);
                    if(ans[row][col+1]>newdis)
                    {
                        ans[row][col+1]=newdis;
                        p.add(new Triplet(row, col+1, newdis));
                    }
                }
                if(row>0)
                {
                    int newdis=Math.abs(h[row-1][col]-h[row][col]);
                    newdis = Math.max(newdis,dis);
                    if(ans[row-1][col]>newdis)
                    {
                        ans[row-1][col]=newdis;
                        p.add(new Triplet(row-1, col, newdis));
                    }
                }
                if(col>0)
                {
                    int newdis=Math.abs(h[row][col-1]-h[row][col]);
                    newdis = Math.max(newdis,dis);
                    if(ans[row][col-1]>newdis)
                    {
                        ans[row][col-1]=newdis;
                        p.add(new Triplet(row, col-1, newdis));
                    }
                }
        }
        System.out.println(ans[m-1][n-1]);
    }
}
