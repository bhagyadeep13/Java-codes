package Graph;
import java.util.*;;
public class Number_of_islands_DFS 
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
    public static void dfs(char[][] g,boolean[][] vis, int a1,int a2)
    {                                     // T.C -- O(M*N)
                                          // T.C -- O(M*N)
        int m=g.length;
        int n=g[0].length;              // USING DFS
        int row=a1;
        int col=a2;
        vis[row][col]=true;
        if(row>0)
            {
                if(g[row-1][col]=='1' && vis[row-1][col]==false)
                {
                    dfs(g,vis,row-1,col);
                }
            }

            if(col>0)
            {
                if(g[row][col-1]=='1' && vis[row][col-1]==false)
                {
                     dfs(g,vis,row,col-1);
                }
            }

            if(row+1<m)
            {
                if(g[row+1][col]=='1' && vis[row+1][col]==false)
                {
                     dfs(g,vis,row+1,col);
                }
            }

            if(col+1<n)
            {
                if(g[row][col+1]=='1' && vis[row][col+1]==false)
                {
                     dfs(g,vis,row,col+1);
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
                        dfs(g, vis, i, j);
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
