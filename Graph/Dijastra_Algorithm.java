package Graph;
import java.util.*;
public class Dijastra_Algorithm 
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
            return Integer.compare(this.dis, p.dis); // compare for minimum
        }
    }
    public static void main(String[] args)  // T.C -- O(N*N)
    {
        List<List<Pair>> adj=new ArrayList<>();
        List<Pair> a=new ArrayList<>();
        List<Pair> b=new ArrayList<>();
        List<Pair> c=new ArrayList<>();
        List<Pair> d=new ArrayList<>();
        List<Pair> e=new ArrayList<>();
        a.add(new Pair(1, 30)); a.add(new Pair(4, 5)); a.add(new Pair(3, 20));
        b.add(new Pair(0, 30)); b.add(new Pair(2, 4));
        c.add(new Pair(1, 4)); c.add(new Pair(3, 7)); c.add(new Pair(4, 8));
        d.add(new Pair(0, 20)); d.add(new Pair(2, 7)); d.add(new Pair(4, 6));
        e.add(new Pair(0, 5)); e.add(new Pair(2, 8)); e.add(new Pair(3, 6));
        adj.add(a); adj.add(b); adj.add(c); adj.add(d); adj.add(e);
        int n=adj.size();
        int[] arr=new int[n]; // 0 se kisi node tak ke distance batane wala array
        for(int i=0;i<arr.length;i++)
        {
            if(i==0) arr[i]=0;
            else arr[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> q=new PriorityQueue<>();
        q.add(new Pair(0, 0));
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
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
