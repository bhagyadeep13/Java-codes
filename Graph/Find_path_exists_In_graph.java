// 1971. Find if Path Exists in Graph

/*There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.
You want to determine if there is a valid path that exists from vertex source to vertex destination.
Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise. */

/*Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
Output: true*/

package Graph;
import java.util.*;;
public class Find_path_exists_In_graph 
{
    public static void bfs(List<List<Integer>> all, boolean[] vis, int i,int end)
    {                                       // T.C -- O(V+2E)
        vis[i]=true;                       //  S.C -- O(V+2E)
        Queue<Integer> q=new ArrayDeque<>();
        q.add(i);
        while(q.size()>0)
        {
            int front = q.remove();
            for(int j=0;j<all.get(front).size();j++)
            {
                int val = all.get(front).get(j);
                if(!vis[val])
                {
                    q.add(val);
                    vis[val]=true;
                    if(val==end) return;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int n=3;
        int[][] e={{0,1},{1,2},{2,0}};
        int s=0;
        int d=2;
        if(s==d) 
        {
            System.out.println(true);
            return;
        }
        List<List<Integer>> all=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> al=new ArrayList<>();
            all.add(al);
        }
        for(int j=0;j<e.length;j++)
        {
            int a=e[j][0];
            int b=e[j][1];
            all.get(a).add(b);
            all.get(b).add(a);
        }
        boolean[] vis=new boolean[n];
        bfs(all,vis,s,d);
        if(vis[d]==false) 
        {
            System.out.println(false);
            return;
        }
        else
        {
            System.out.println(true);
        }
    }
}
