package Graph;
import java.util.*;
public class Topological_sort_BFS 
{
    // Kahn's algorithm T.C -- O(V+E)
    public static void bfs(List<List<Integer>> adj,int[] deg,List<Integer> al)
    {
        Queue<Integer> q=new ArrayDeque<>(); // make a queue
        for(int i=0;i<adj.size();i++)
        {
            if(deg[i]==0)   // if Degree of i node is 0 add it into the queue
            {
                q.add(i);
            }
        }
        while(q.size()>0)
        {
            int front = q.remove();
            al.add(front);           // add the node to ans list
            for(int i=0;i<adj.get(front).size();i++)
            {
                int val =adj.get(front).get(i);
                deg[val]--;                    // Decrease the degree by 1
                if(deg[val]==0)                // if Degree of i node is 0 now add it into the queue
                {
                    q.add(val);
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
        a.add(1);
        b.add(2); b.add(3);
        c.add(3); c.add(4);
        e.add(3);
        adj.add(a); adj.add(b); adj.add(c); adj.add(d); adj.add(e);
        int n=adj.size();
        int[] inDegree= new int[n];  // In degree array 
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                inDegree[adj.get(i).get(j)]++;  // fill the inDegree Array
            }
        }
        List<Integer> al=new ArrayList<>();
        bfs(adj, inDegree,al);
        System.out.println(al);
    }
}
