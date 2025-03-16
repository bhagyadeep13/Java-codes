package Graph;
import java.util.*;
public class Detect_Cycle_In_DCG_DFS 
{
    static boolean ans;
    // Detecting Cycle in DCG using DFS
    public static void dfs(boolean[] vis,List<List<Integer>> adj,int i,boolean[] path)
    {
    vis[i]=true;
    path[i]=true;
    for(int j=0;j<adj.get(i).size();j++)
    {
        int val=adj.get(i).get(j);
        if(path[val]==true)
        {
            ans=false; // means cycle detected
        }
        if(!vis[val])
        {
            dfs(vis,adj,val,path);
        }
    }
    path[i] = false;
    }
    public static void main(String[] args) 
    {
        int[][] pre ={{1,0}};
        int n=2;
        ans=true; // true means that no cycle
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> al=new ArrayList<>();
            adj.add(al);
        }
        for(int i=0;i<pre.length;i++)
        {
            int a=pre[i][0];
            int b=pre[i][1];
            adj.get(b).add(a);
        }
        boolean[] vis=new boolean[n];
        boolean[] path=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                dfs(vis,adj,i,path);
            }
        }
        System.out.println(ans);
    }
}
