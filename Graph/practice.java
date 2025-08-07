package Graph;

import java.util.*;

public class practice 
{
    public static void bfs(int i,boolean[] vis,int[][] arr) // bfs 
    {
        vis[i] = true;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(i);
        while(q.size()>0)
        {
            int front = q.remove();
            for(int j=0;j<arr[front].length;j++)
            {
                if(arr[front][j]==1) // means edge btw i to j
                {
                    if(!vis[j])
                    {
                        q.add(j);
                        vis[j] = true;
                    }

                }
            }
        }
    }
    public static void dfs(int i,boolean[] vis,int[][] arr)  // dfs 
    {
        vis[i] = true;
        for(int j=0;j<arr[i].length;j++)
        {
            if(arr[i][j]==1) // means edge btw i to j
            {
                if(!vis[j])
                {
                    dfs(j,vis,arr);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int[][] a = {{1,1,0},{1,1,0},{0,0,1}};
        int n = a.length;
        int count=0;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                bfs(i,vis,a);
                count++;
            }
        }
        System.out.println(count);

        int count1 = 0;
        boolean[] vis1 = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis1[i])
            {
                dfs(i,vis1,a);
                count1++;
            }
        }
        System.out.println(count1);
    }
}
