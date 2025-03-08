package Graph;
import java.util.*;
public class Topological_sort 
{
    public static void dfs(boolean[] vis,List<List<Integer>>  adj, int i, List<Integer> al)
    {
        vis[i]=true;
        for(int j=0;j<adj.get(i).size();j++)
        {
            int val=adj.get(i).get(j);
            if(!vis[val])
            {
                dfs(vis, adj, val, al);
            }
        }
        al.add(i);
    }
    public static void main(String[] args) 
    {
        List<List<Integer>> adj=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        List<Integer> e=new ArrayList<>();
        a.add(1);
        b.add(2); b.add(3);
        c.add(3); c.add(4);
        e.add(3);
        adj.add(a); adj.add(b); adj.add(c); adj.add(d); adj.add(e);
        int n=adj.size();
        boolean[] vis=new boolean[n];
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                dfs(vis,adj,i,al);
            }
        }
        for(int i=al.size()-1;i>=0;i--)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}
