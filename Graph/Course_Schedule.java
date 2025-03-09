//  207. Course Schedule

/*There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false. */
package Graph;
import java.util.*;
public class Course_Schedule 
{

    public static void main(String[] args) 
    {
        int[][] pre = {{1,0}};
        int n=2;
        List<Integer> ans =new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
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

        System.out.println(adj);
        boolean[] vis = new boolean[n];
        int[] inDegree= new int[n];

        for(int i=0;i<n;i++)    // InDegree Array
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                int val = adj.get(i).get(j);
                inDegree[val]++;
            }
        }

        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(inDegree[i]==0)
            {
                q.add(i);
                vis[i]=true;
            }
        }

        while (q.size()>0) 
        {
            int front = q.remove();
            ans.add(front);
            for(int i=0;i<adj.get(front).size();i++)
            {
                int val = adj.get(front).get(i);
                inDegree[val]--;
                if(inDegree[val]==0)
                {
                    q.add(val);
                    vis[val]=true;
                }
            }
        }
        if(ans.size()==n) 
        {
            System.out.println(true);
            return;
        }
        else
        {
            System.out.println(false);
            return;
        }
    }
    
}
