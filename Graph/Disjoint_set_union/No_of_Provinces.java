package Graph.Disjoint_set_union;
import java.util.*;
public class No_of_Provinces 
{
    static int[] parent;
    public static int find(int a) // return the leader of a any Node
    {
        if(parent[a]==a) return a;
        else return parent[a] = find(parent[a]);
    }
    /*public static int find(int a) // return the leader of a any Node
    {
        if(parent[a]==a) return a;
        else return parent[a] = find(parent[a]);
    }*/
    public static void union(int a,int b)
    {
        int leaderA=find(a);
        int leaderB=find(b);
        if(leaderA!=leaderB)
        {
            parent[leaderB]=leaderA;
        }
    }
    public static void main(String[] args) 
    {
        int[][] adj = {{1,1,0},{1,1,0},{0,0,1}};
        int n=adj.length;
        parent=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            parent[i]=i;
        }
        for(int i=0;i<n;i++)             // T.C -> O(N*N)
        {
            for(int j=0;j<n;j++)
            {
                // i+1 -> ith node
                // j+1 -> jth node
                if(i!=j && adj[i][j]==1)
                {
                    union(i+1,j+1);
                }
            }
        }
        int count=0;
        for(int i=1;i<parent.length;i++)
        {
            if(parent[i]==i) count++;
        }
        System.out.println(count);
    }
}
