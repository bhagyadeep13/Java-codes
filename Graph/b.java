package Graph;
import java.util.*;
public class b 
{
    static int[] parent;
    static boolean[] parity;
    static boolean ans;

    public static int find(int a)
    {
        if(parent[a]==a) return a;
        else return find(parent[a]);
    }
    public static void union(int a,int b)
    {
        int leaderA=find(a);
        int leaderB=find(b);
        if(leaderA!=leaderB)
        {
            parent[leaderB]=leaderA;
            parity[b]=!parity[a];
        }
        else
        {
            if(parity[a]==parity[b])
            {
                ans=false;
                return;
            }
        }
        
    }
    public static void main(String[] args) 
    {
        ans=true;
        int[][] adj = {{1,2,3},{0,2},{0,1,3},{0,2}};
        int n=adj.length;

        parent=new int[adj.length];
        parity=new boolean[adj.length];

        for(int i=0;i<parent.length;i++)
        {
            parent[i]=i;
        }

        for(int i=0;i<parent.length;i++)
        {
            parent[i]=i;
            parity[i]=false;
        }

        for(int i=0;i<adj.length;i++)
        {
            for(int j=0;j<adj[i].length;j++)
            {
                int val = adj[i][j];
                if(val>i)
                {
                    union(i,val);
                }
            }
        }
        System.out.println(ans);
    }
}
