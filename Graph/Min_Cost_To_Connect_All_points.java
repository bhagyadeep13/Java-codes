// 1584. Min Cost to Connect All Points

/*You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].
The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.
Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points. */

/*Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
Output: 20 */

package Graph;
import java.util.*;
public class Min_Cost_To_Connect_All_points 
{
    static class Triplet implements Comparable<Triplet>
    {
        int node;
        int Parent;
        int weight;
        Triplet(int node,int Parent,int weight)
        {
            this.node=node;
            this.Parent=Parent;
            this.weight=weight;
        }
        public int compareTo(Triplet t)
        {
            return this.weight-t.weight;
            // Integer.compare(this.weight,t.weight);
        }
    }
    static class Pair
    {
        int node;
        int weight;
        Pair(int node,int weight)
        {
            this.node=node;
            this.weight=weight;
        }
    }
    public static int helper(int x1,int x2,int y1,int y2)
    {
        int val = Math.abs(x1-x2) + Math.abs(y1-y2);
        return val;
    }
    public static void main(String[] args)  // Using Prims Algorithm
    {
        int[][] p ={{0,0},{2,2},{3,10},{5,2},{7,0}};
        int sum=0;
        int n=p.length;
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Pair> al=new ArrayList<>();
            adj.add(al);
        }
        for(int i=0;i<n;i++)  // converting to input List
        {
            int x1 = p[i][0];
            int y1 = p[i][1];
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                int x2 = p[j][0];
                int y2 = p[j][1];
                int md = helper(x1,x2,y1,y2);
                Pair p2= new Pair(j,md);
                adj.get(i).add(p2);
                }
            }
        }/*
        for(int i=0;i<n;i++)
        {
            List<Pair> al=adj.get(i);
            for(int j=0;j<al.size();j++)
            {
                Pair p2=al.get(j);
                System.out.print(p2.node +","+p2.weight+" ");
            }
            System.out.println();
        }*/
        boolean[] vis=new boolean[n];  // main algorithm
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        pq.add(new Triplet(0,-1,0));
        while (pq.size()>0) 
        {
            Triplet t=pq.remove();
            int node = t.node;
            int Parent = t.Parent;
            int weight = t.weight;
            if(vis[node]!=true)
            {
                sum=sum+weight;
                vis[node]=true;
            for(int i=0;i<adj.get(node).size();i++)
            {
                Pair p1=adj.get(node).get(i);
                int node1 = p1.node;
                int weightNew = p1.weight;
                if(node1!=Parent && vis[node1]!=true)
                {
                    pq.add(new Triplet(node1, node, weightNew));
                }
            }
            }
        }
        System.out.println(sum);
    }
}
