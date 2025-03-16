// 1514. Path with Maximum Probability

/*You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where edges[i] = [a, b] is an undirected edge connecting the nodes a and b with a probability of success of traversing that edge sp[i].
Given two nodes start and end, find the path with the maximum probability of success to go from start to end and return its success probability.
If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer by at most 1e-5. */

/*Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2
Output: 0.25000 */

package Graph;
import java.util.*;
public class Pair_with_Max_Probablity // Using Dijaskrta Algorithm
{ 
    static class Pair implements Comparable<Pair>
    {
        int val;
        double dis;
        Pair(int val,double dis)
        {
            this.val=val;
            this.dis=dis;
        }
        public int compareTo(Pair p)
        {
            if(this.dis==p.dis) return Integer.compare(this.val,p.val); // min value
            return Double.compare(this.dis,p.dis); // compare on basis of min value
        }
    }
    public static void main(String[] args) 
    {
        int[][] e={{0,1},{1,2},{0,2}};
        double[] sp={0.5,0.5,0.2};
        int n=3;
        int s=0;
        int end=2;
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Pair> al=new ArrayList<>();
            adj.add(al);
        }
        for(int i=0;i<e.length;i++)
        {
            int node1 = e[i][0];
            int node2 = e[i][1];
            adj.get(node1).add(new Pair(node2,sp[i]));
            adj.get(node2).add(new Pair(node1,sp[i]));
        }
        double[] arr=new double[n];
        for(int i=0;i<arr.length;i++)
        {
            if(i==s) arr[i]=1;
            else arr[i]=0;
        }
        PriorityQueue<Pair> q=new PriorityQueue<>(Collections.reverseOrder());
        q.add(new Pair(s, (double)1));
        while(q.size()>0)
        {
            Pair front = q.remove();
            int val = front.val;
            double dis = front.dis;
            if(arr[val]<=dis)
            {
                for(int i=0;i<adj.get(val).size();i++)
                {
                    Pair p = adj.get(val).get(i);
                    int v = p.val;
                    double distance = p.dis;
                    double newdis = dis * distance;
                    if(newdis>arr[v])
                    {
                        arr[v]=newdis;
                        q.add(new Pair(v,newdis));
                    }
                }
            }
        }
        System.out.println(arr[end]);
    }
}
