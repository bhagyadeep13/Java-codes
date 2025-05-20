// 684. Redundant Connection

/*In this problem, a tree is an undirected graph that is connected and has no cycles.
You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.
Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are multiple answers, return the answer that occurs last in the input. */

/*Input: edges = [[1,2],[1,3],[2,3]]
Output: [2,3] */

package Graph.Disjoint_set_union;
import java.util.*;
public class Retundant_Connection 
{
    static int[] parent;
    static int[] ans;
    public static int find(int a)
    {
        if(parent[a]==a) return a;
        else return parent[a] = find(parent[a]);
    }
    public static void union(int a,int b)
    {
        int leaderA=find(a);
        int leaderB=find(b);
        if(leaderA!=leaderB)
        {
            parent[leaderB]=leaderA;
        }
        else
        {
            ans[0]=a;
            ans[1]=b;
            return;
        }
    }
    public static void main(String[] args) 
    {
        int[][] edges={{1,2},{1,3},{2,3}};
        int n=edges.length;
        parent = new int[n+1];
        ans=new int[2];
        for(int i=1;i<=n;i++)
        {
            parent[i]=i;
        }
        for(int i=0;i<n;i++)
        {
            union(edges[i][0],edges[i][1]);
        }
        System.out.print(ans[0]+","+ans[1]);
    }
}
