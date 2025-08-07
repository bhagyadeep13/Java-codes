// Find the nodes which are part of a cycle in directed graph

package Graph;
import java.util.*;
public class Find_nodes_part_of_cycle 
{
    public static void main(String[] args) 
    {
        int[][] g={{1,2},{2,3},{5},{0},{5},{},{}};
        
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> all=new ArrayList<>(); // adjlist of reversed graph
        for(int i=0;i<g.length;i++)
        {
            List<Integer> al=new ArrayList<>();
            all.add(al);
        }
        for(int i=0;i<g.length;i++) // reverse the graph 
        {
            for(int j=0;j<g[i].length;j++)
            {
                all.get(g[i][j]).add(i);
            }
        }

        // kahn's algorithm
        int[] inDegree = new int[all.size()];
        for(int i=0;i<all.size();i++)
        {
            for(int j=0;j<all.get(i).size();j++)
            {
                int val = all.get(i).get(j);
                inDegree[val]++;
            }
        }
        
        Queue<Integer> q=new ArrayDeque();
        for(int i=0;i<all.size();i++)
        {
            if(inDegree[i]==0)
            {
                q.add(i);
            }
        }

        while(q.size()>0)
        {
            int front = q.remove();
            ans.add(front);
            for(int i=0;i<all.get(front).size();i++)
            {
                int val =all.get(front).get(i);
                inDegree[val]--;
                if(inDegree[val]==0)
                {
                    q.add(val);
                }
            }
        }
        for(int i=0;i<all.size();i++)
        {
            if(!ans.contains(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
