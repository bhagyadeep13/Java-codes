// 787. Cheapest Flights Within K Stops

/*There are n cities connected by some number of flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.
You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops. If there is no such route, return -1. */

/*Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1 */

package Graph;
import java.util.*;
public class Cheapest_flight_within_K_stops 
{
    static class Pair
    {
        int n;
        int dis;
        Pair(int n,int dis)
        {
            this.n=n;
            this.dis=dis;
        }
    }
    static class Triplet implements Comparable<Triplet>
    {
        int n;
        int dis;
        int stops;
        Triplet(int n,int dis,int stops)
        {
            this.n=n;
            this.dis=dis;
            this.stops=stops;
        }
        public int compareTo(Triplet t)
        {
            return Integer.compare(this.stops, t.stops);
        }
    }
    public static void main(String[] args) 
    {
        int[][] f = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int n1=4;
        int src=0;
        int des=3;
        int k=1;
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n1;i++)
        {
            List<Pair> al=new ArrayList<>();
            adj.add(al);
        }
        for(int i=0;i<f.length;i++)
        {
            int a=f[i][0];
            int b=f[i][1];
            int dis=f[i][2];
            adj.get(a).add(new Pair(b, dis));
        }
        int[] ans=new int[n1];
        for(int i=0;i<n1;i++)
        {
            ans[i]=Integer.MAX_VALUE;
        }
        ans[src]=0;
        PriorityQueue<Triplet> p=new PriorityQueue<>();
        p.add(new Triplet(src,0,0));
        while(p.size()>0)
        {
            Triplet t=p.remove();
            int n=t.n;
            int dis=t.dis;
            int stops=t.stops;
                for(int i=0;i<adj.get(n).size();i++)
                {
                    Pair pair=adj.get(n).get(i);
                    int val = pair.n;
                    int distance = pair.dis;
                    int newdis = distance + dis;
                    if(ans[val]>newdis && stops<k+1)
                    {
                        ans[val]=newdis;
                        p.add(new Triplet(val, newdis, stops+1));
                    }
                }
            }
        if(ans[des]==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(ans[des]);
    }
}
