package Graph;
import java.util.*;

public class Bellmon_Ford_Algorihtm 
{
    static class Triplet
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
    }
    public static void helper(List<Triplet> adj,int[] arr)
    {
        for(int i=0;i<adj.size();i++)
        {
            Triplet t = adj.get(i);
            int node1=t.node1;
            int node2=t.node2;
            int wt=t.wt;
            if(arr[node1]!=Integer.MAX_VALUE)
            {
                int newWeight = wt + arr[node1];
                if(newWeight<arr[node2])
                {
                    arr[node2]=newWeight;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int n=5;
        List<Triplet> adj = new ArrayList<>();      // T.C -> O(V*E)
        adj.add(new Triplet(2, 3, 7));
        adj.add(new Triplet(4, 2, 8));
        adj.add(new Triplet(0, 3, 20));
        adj.add(new Triplet(2, 1, 4));
        adj.add(new Triplet(0, 1, 30));
        adj.add(new Triplet(4, 3, 6));
        adj.add(new Triplet(0, 4, 5));

        int[] arr=new int[n];  // array which stores the min wt from 0th node to others
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.MAX_VALUE;
        }
        arr[0]=0;
        for(int i=0;i<n-1;i++)  // we have to do operation n-1 times
        {
            helper(adj,arr);
        }
        // now we have to run nth time for -ve cycle detection
        for(int i=0;i<adj.size();i++)
        {
            Triplet t = adj.get(i);
            int node1=t.node1;
            int node2=t.node2;
            int wt=t.wt;
            if(arr[node1]!=Integer.MAX_VALUE)
            {
                int newWeight = wt + arr[node1];
                if(newWeight<arr[node2])
                {
                    System.out.println(-1); // -ve cycle detected
                    return;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
