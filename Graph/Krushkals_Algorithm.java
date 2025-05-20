package Graph;
import java.util.*;
public class Krushkals_Algorithm 
{
    static int[] parent    ;
    static int ans;
    static List<Triplet> mst;
    static class Triplet implements Comparable<Triplet>
    {
        int node1;
        int node2;
        int wt;
        Triplet(int node1,int node2,int wt)
        {
            this.node1=node1;
            this.node2=node2;
            this.wt=wt;
        }
        public int compareTo(Triplet t)
        {
            return Integer.compare(this.wt,t.wt);
        }
    }
    public static int find(int a)
    {
        if(parent[a]==a) return a;
        else return find(parent[a]);
    }
    public static void union(int a,int b,int wt)
    {
        int leaderA=find(a);
        int leaderB=find(b);
        if(leaderA!=leaderB)
        {
            parent[leaderB]=leaderA;
            mst.add(new Triplet(a, b, wt));
            ans=ans+wt;
        }
    }
    public static void main(String[] args) // used the concept of DSU
    {
        int n=7;
        ans=0;
        parent = new int[n];
        mst=new ArrayList<>();
        List<Triplet> adj = new ArrayList<>();
        adj.add(new Triplet(2, 0, 9));
        adj.add(new Triplet(5, 4, 11));
        adj.add(new Triplet(1, 6, 14));
        adj.add(new Triplet(6, 4, 15));
        adj.add(new Triplet(1, 5, 19));
        adj.add(new Triplet(3, 5, 21));
        adj.add(new Triplet(3, 1, 24));
        adj.add(new Triplet(2, 3, 26));
        adj.add(new Triplet(0, 6, 29));

        for(int i=0;i<n;i++)
        {
            parent[i]=i;
        }

        PriorityQueue<Triplet> p=new PriorityQueue<>();
        
        for(int i=0;i<adj.size();i++)
        {
            p.add(adj.get(i));
        }

        while(p.size()>0)
        {
            Triplet front = p.remove();
            int node1 = front.node1;
            int node2 = front.node2;
            int wt = front.wt;
            union(node1,node2,wt);
        }
        for(int i=0;i<mst.size();i++)
        {
            Triplet t=mst.get(i);
            System.out.println(t.node1+" "+t.node2+" "+t.wt);
        }
        System.out.println(ans);
    }
}
