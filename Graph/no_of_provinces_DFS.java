package Graph;
import java.util.*;
public class no_of_provinces_DFS 
{
    public static void dfs(int i, boolean[] vis, int[][] adj) 
    {                                           // USING DFS
        vis[i]=true;
        for(int j=0;j<adj[0].length;j++)
            {
                if(adj[i][j]==1)
                {
                    if(!vis[j]) 
                    {
                        dfs(j, vis, adj);
                    }
                }
            }
        
    }
    public static void main(String[] args) 
    {
        int[][] adj={{1,1,0},{1,1,0},{0,0,1}};
        int n=adj.length;
        int count=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i]) 
            {
                dfs(i,vis,adj);
                count++;
            }
        }
        System.out.println(count);
    }
}
