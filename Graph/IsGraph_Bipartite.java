package Graph;
import java.util.*;
public class IsGraph_Bipartite 
{
    static boolean ans;
    public static void bfs(int[] vis,int[][] adj, int a)
    {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(a);
        vis[a]=0; // 1 --> red and 0 --> blue
        while(q.size()>0)
        {
            int front = q.remove();
            int color = vis[front];
            for(int ele : adj[front]) // iterate on eleth row
            {
                if(vis[ele]==vis[front]) 
                {
                    ans=false;
                    return;
                }
                if(vis[ele]==-1)
                {
                    vis[ele]=1-color;
                    q.add(ele);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        ans=true;
        int[][] adj = {{1,2,3},{0,2},{0,1,3},{0,2}};
        int n=adj.length;
        int[] vis=new int[adj.length];
        Arrays.fill(vis,-1);
        for(int i=0;i<n;i++)
        {
            if(ans==false) 
            {
                System.out.println(false);
                return;
            }
            if(vis[i]==-1)
            {
                bfs(vis,adj,i);
            }
        }
        System.out.println(ans);

    }
}
