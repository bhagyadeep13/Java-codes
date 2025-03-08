package Graph;
import java.util.*;;
public class Cycle_detection_In_undirected_graph 
{
    static boolean flag=false;
    static class Pair
    {
        int x;
        int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public static void bfs(boolean[] vis,int a, int[][] adj)
    {                                                            // USING BFS
        Queue<Pair> q=new ArrayDeque<>();
        if(a==0) q.add(new Pair(a, -1));
        while(q.size()>0)
        {
            Pair front = q.remove();
            int ele = front.x;
            int parent = front.y;
            if(vis[ele])  // checking that ki vis[ele] pehle se hi true h ki nhi
            {
                flag=true;
                return;
            }
            vis[ele]=true;
            for(int j=0;j<adj.length;j++)
            {
                if(adj[ele][j]==1)
                {
                    if(!vis[j] && parent!=j)
                    {
                        q.add(new Pair(j, ele));
                    }
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int[][] adj={{1,1,0,0,0},{1,1,1,0,1},{0,1,1,1,0},{0,0,1,1,1},{0,1,0,1,1}};
        int n=adj.length;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                bfs(vis, i, adj);
            }
        }
        System.out.println(flag);
    }
}
