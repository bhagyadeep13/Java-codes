package Graph;
import java.util.*;
public class Cycle_detection_DFS_Undirected 
{
    static boolean flag=false;
    public static void dfs(boolean[] vis, int a, int[][] adj,int b)
    {
        if(vis[a]==true) 
        {
            flag=true;
            return;
        }
        vis[a]=true;
        for(int i=0;i<adj[0].length;i++)
        {
            int val = adj[a][i];
            if(val==1)
            {
                if(!vis[val] && val!=b) 
                {
                    dfs(vis,val,adj,a);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int[][] adj={{1,1,0,0,0},{1,1,1,0,1},{0,1,1,1,0},{0,0,1,1,1},{0,1,0,1,1}};
        int n=adj.length;
        boolean[] vis=new boolean[n];
        dfs(vis,0, adj, -1);
        for(int i=0;i<vis.length;i++)
        {
            System.out.print(vis[i]+" ");
        }
        System.out.println(flag);
    }
}
