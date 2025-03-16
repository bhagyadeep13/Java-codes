// 743. Network Delay Time

/*You are given a network of n nodes, labeled from 1 to n. You are also given times, a list of travel times as directed edges times[i] = (ui, vi, wi), where ui is the source node, vi is the target node, and wi is the time it takes for a signal to travel from source to target.
We will send a signal from a given node k. Return the minimum time it takes for all the n nodes to receive the signal. If it is impossible for all the n nodes to receive the signal, return -1. */

/*Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
Output: 2 */

package Graph;
import java.util.*;
public class Network_Delay_Time   // USING DIJASKTRA ALGORITHM
{
    static class Pair implements Comparable<Pair>
    {
        int val;
        int dis;
        Pair(int val,int dis)
        {
            this.val=val;
            this.dis=dis;
        }
        public int compareTo(Pair p)
        {
            return this.dis-p.dis;
        }
    }
    public static void main(String[] args) 
    {
        int[][] t={{2,1,1},{2,3,1},{3,4,1}};
        int n=4;
        int k=2;
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n+1;i++)
        {
            List<Pair> al=new ArrayList<>();
            adj.add(al);
        }
        for(int i=0;i<t.length;i++)
        {
                int node1 = t[i][0];
                int node2 = t[i][1];
                int dis = t[i][2];
                adj.get(node1).add(new Pair(node2,dis));
        }
        int[] arr=new int[n+1]; // 0 se kisi node tak ke distance batane wala array
        for(int i=1;i<arr.length;i++)
        {
            if(i==k) arr[i]=0;
            else arr[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> q=new PriorityQueue<>();
        q.add(new Pair(k, 0));
        while(q.size()>0)
        {
            Pair front = q.remove();
            int val = front.val;
            int dis = front.dis;
            if(arr[val]>=dis)
            {
                for(int i=0;i<adj.get(val).size();i++)
                {
                    Pair p = adj.get(val).get(i);
                    int v = p.val;
                    int distance = p.dis;
                    int newdis = dis + distance;
                    if(newdis<arr[v])
                    {
                        arr[v]=newdis;
                        q.add(new Pair(v, newdis));
                    }
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==Integer.MAX_VALUE) 
            {
                System.out.println(-1);
                return;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
    
}
