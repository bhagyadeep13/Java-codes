package Graph.Disjoint_set_union;
import java.util.*;
public class isBipartite 
{
    static int[] parent;
    static boolean[] parity;
    static boolean ans=false;
    public static int find(int a) // return the leader of a any Node
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
            parity[b]=!parity[a];
        }
        else
        {
            if(parity[a]==parity[b])  // odd cycle detected
            {
                ans=false;
                return;
            }
        }
    }
    public static void main(String[] args) 
    {
        int[][] adj = {{1,2,3},{0,2},{0,1,3},{0,2}};
        int n=adj.length;
        parent=new int[n];
        parity=new boolean[n];
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
            parity[i]=false;
        }
        for(int i=0;i<adj.length;i++)
        {
            for(int j=0;j<adj[i].length;j++)
            {
                int val = adj[i][j];
                if(val>i)
                {
                    System.out.println(i+" "+val);
                    int node1=i;
                    int node2=val;
                    union(node1,node2);
                }
            }
        }
        System.out.println(ans);
    }
}
