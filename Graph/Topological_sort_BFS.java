package Graph;
import java.util.*;
public class Topological_sort_BFS 
{
    public static void bfs(List<List<Integer>> adj,int[] deg,boolean[] vis,List<Integer> al)
    {
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<adj.size();i++)
        {
            if(deg[i]==0)
            {
                q.add(i);
                vis[i]=true;
            }
        }
        while(q.size()>0)
        {
            int front = q.remove();
            al.add(front);
            for(int i=0;i<adj.get(front).size();i++)
            {
                int val =adj.get(front).get(i);
                deg[val]--;
                if(deg[val]==0)
                {
                    q.add(val);
                    vis[val]=true;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        List<List<Integer>> adj=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        List<Integer> e=new ArrayList<>();
        //List<Integer> f=new ArrayList<>();
        /*a.add(2); a.add(3);
        b.add(2); b.add(4);
        d.add(2);
        e.add(2); e.add(3); e.add(5);
        f.add(1);*/
        a.add(1);
        b.add(2); b.add(3);
        c.add(3); c.add(4);
        e.add(3);
        adj.add(a); adj.add(b); adj.add(c); adj.add(d); adj.add(e);
        int n=adj.size();
        int[] inDegree= new int[n];  // in degree array 
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                inDegree[adj.get(i).get(j)]++;
            }
        }
        List<Integer> al=new ArrayList<>();
        boolean[] vis=new boolean[n];
        bfs(adj, inDegree, vis, al);
        System.out.println(al);
    }
}
