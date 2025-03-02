// 200. Number of Islands

/*Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water. */

/*Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1 */

package Graph;
import java.util.*;;
public class Number_of_Islands 
{
    static class Pair
    {
        int i;
        int j;
        Pair(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
    public static void bfs(boolean[][] vis, char[][] g,int a1,int a2)
    {                                     // T.C -- O(M*N)
        int m=g.length;                  // T.C -- O(M*N)
        int n=g[0].length;
        vis[a1][a2]=true;
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(a1,a2));
        while(q.size()>0)
        {
            Pair p = q.remove();
            int row=p.i;
            int col=p.j;
            // Top -> row-1,col
            if(row>0)
            {
                if(g[row-1][col]=='1' && vis[row-1][col]==false)
                {
                    q.add(new Pair(row-1, col));
                    vis[row-1][col]=true;
                }
            }
            // Bottom -> row+1,col
            if(row+1<m)
            {
                if(g[row+1][col]=='1' && vis[row+1][col]==false)
                {
                    q.add(new Pair(row+1, col));
                    vis[row+1][col]=true;
                }
            }
            // Left -> row,col-1
            if(col>0)
            {
                if(g[row][col-1]=='1' && vis[row][col-1]==false)
                {
                    q.add(new Pair(row, col-1));
                    vis[row][col-1]=true;
                }
            }
            // Right -> row,col+1
            if(col+1<n)
            {
                if(g[row][col+1]=='1' && vis[row][col+1]==false)
                {
                    q.add(new Pair(row, col+1));
                    vis[row][col+1]=true;
                }
            }
        }
    }
    public static int numIslands(char[][] g) 
    {
        int m=g.length;
        int n=g[0].length;
        int count=0;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                if(g[i][j]=='1')
                {
                    if(!vis[i][j])
                    {
                        bfs(vis, g, i, j);
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        char[][] a={{'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}};
        System.out.println(numIslands(a));
    }
}
