package Graph;
import java.util.*;
public class Floyd_Warshal_Algorithm // use to find dis from one node to all node
{
    public static void main(String[] args) 
    {
        int n=5;
        // fiven edge list( from,to,wt)
        int[][] edges={{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
        int[][] dis=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            dis[u][v]=wt;
            dis[v][u]=wt;
        }
        // Floyd Warshal Algorithm
        for(int k=0;k<n;k++)          // T.C -> O(N*N*N)
        {                             // S.C -> O(N*N)
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(dis[i][k]!=Integer.MAX_VALUE && dis[k][j]!=Integer.MAX_VALUE)
                    dis[i][j] = Math.min(dis[i][j],dis[i][k]+dis[k][j]);
                }
            }
        }
        for(int i=0;i<dis.length;i++)
        {
            for(int j=0;j<dis.length;j++)
            {
                System.out.print(dis[i][j]+" ");
            }
            System.out.println();
        }
    }
}
