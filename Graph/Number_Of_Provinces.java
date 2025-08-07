// 547. Number of Provinces

/*There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
A province is a group of directly or indirectly connected cities and no other cities outside of the group.
You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
Return the total number of provinces. */

/*
Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2 
*/

package Graph;
import java.util.*;
public class Number_Of_Provinces 
{ 
    public static void bfs(int i, boolean[] vis, int[][] adj) 
    {                           // T.C -- O(N^2)
        vis[i]=true;
        Queue<Integer> q=new ArrayDeque<>();
        q.add(i);
        while(q.size()>0)
        {
            int front = q.remove();
            for(int j=0;j<adj[0].length;j++)
            {
                if(adj[front][j]==1)
                {
                    if(!vis[j]) 
                    {
                        q.add(j);
                        vis[j]=true;
                    }
                }
            }
        }
    }
    public static void main(String[  ] args) 
    {
        int[][] adj={{0,1,0},{1,0,0},{0,0,0}};
        int n=adj.length;
        int count=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i]) 
            {
                bfs(i,vis,adj);
                count++;
            }
        }
        System.out.println(count);
    }
}
