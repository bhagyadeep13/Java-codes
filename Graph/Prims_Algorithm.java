package Graph;
import java.util.*;
public class Prims_Algorithm 
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
    public static void main(String[] args) 
    {
        int n=5;
        List<List<Pair>> adj = new ArrayList<>();
        List<Triplet> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Pair> al=new ArrayList<>();
            adj.add(al);
        }
        List<Pair> a =adj.get(0);
        List<Pair> b =adj.get(1);
        List<Pair> c =adj.get(2);
        List<Pair> d =adj.get(3);
        List<Pair> e =adj.get(4);
        a.add(new Pair(1, 2)); a.add(new Pair(4,1)); a.add(new Pair(2, 5));
        b.add(new Pair(0, 2)); b.add(new Pair(4, 3)); b.add(new Pair(3, 1));
        c.add(new Pair(0, 5)); c.add(new Pair(4, 2)); c.add(new Pair(3, 5));
        d.add(new Pair(1, 1)); d.add(new Pair(2, 5)); d.add(new Pair(4, 4));
        e.add(new Pair(0, 1)); e.add(new Pair(2, 2));
        e.add(new Pair(1, 3)); e.add(new Pair(3, 4));

        boolean[] vis=new boolean[n];
        PriorityQueue<Triplet> p=new PriorityQueue<>();
        p.add(new Triplet(0,-1,0));
        while (p.size()>0) 
        {
            Triplet t=p.remove();
            int node = t.node;
            int Parent = t.Parent;
            int weight = t.weight;
            if(Parent!=-1 && vis[node]!=true)
            {
                ans.add(new Triplet(node,Parent,weight));
            }
            vis[node]=true;
            for(int i=0;i<adj.get(node).size();i++)
            {
                Pair p1=adj.get(node).get(i);
                int node1 = p1.node;
                int weightNew = p1.weight;
                if(node1!=Parent && vis[node1]!=true)
                {
                    p.add(new Triplet(node1, node, weightNew));
                }
            }
        }
        for(int i=0;i<ans.size();i++)
        {
            Triplet t1=ans.get(i);
            System.out.println(t1.node+" "+t1.Parent+" "+t1.weight);
        }
    }
}
