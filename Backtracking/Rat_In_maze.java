/*Consider a rat placed at position (0, 0) in an n x n square matrix mat. The rat's goal is to reach the destination at position (n-1, n-1). The rat can move in four possible directions: 'U'(up), 'D'(down), 'L' (left), 'R' (right).

The matrix contains only two possible values:

0: A blocked cell through which the rat cannot travel.
1: A free cell that the rat can pass through.
Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell. In case of no path, return an empty list.+

The task is to find all possible paths the rat can take to reach the destination, starting from (0, 0) and ending at (n-1, n-1), under the condition that the rat cannot revisit any cell along the same path. Furthermore, the rat can only move to adjacent cells that are within the bounds of the matrix and not blocked. */

package Backtracking;
import java.util.*;
public class Rat_In_maze 
{
    public static void helper(List<String> al,int i,int j,int[][] m,String s,int n,boolean[][] vis)
    {                                      // T.C -- O(3^(N^2))
        if(i==n-1 && j==n-1)                // S.C -- O(N*M)
        {
            al.add(s);
            return;
        }
        if(i>=0 && i<n && j>=0 && j<n)
        {
            if(vis[i][j]==true || m[i][j]==0)
            {
                return;
            }
            vis[i][j] = true;
            helper(al, i-1, j, m, s+'U', n, vis);
            helper(al, i+1, j, m, s+'D', n, vis);
            helper(al, i, j-1, m, s+'L', n, vis);
            helper(al, i, j+1, m, s+'R', n, vis);
            vis[i][j] = false;
        }
    }
    public static void main(String[] args) 
    {
        int n=5;
        List<String> al=new ArrayList<>();
        int[][] a={{1,1,1,0,1}, {1, 0, 1, 1,1}, {0, 0,1,1,1}, {1,0,0, 1, 1},{1,0,0,0, 1}};
        boolean[][] vis = new boolean[n][n];
        helper(al,0,0,a,"",n,vis);
        System.out.println(al);
    }
}
