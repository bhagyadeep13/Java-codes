package Graph;

import java.util.*;

public class p 
{
    static List<Integer> ans;
    public static void helper(int[][] a)
    {   
        int n = a.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> al = new ArrayList<>();
            adj.add(al);
        }
        int[] deg = new int[n];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                int val =  a[i][j];
                adj.get(val).add(i);
                deg[i]++;
            }
        }
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
            ans.add(front);           // add the node to ans list
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
        ans = new ArrayList<>();
        int[][] g={{1,2},{2,3},{5},{0},{5},{},{}};
        helper(g);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
