package Graph;
import java.util.*;
public class c 
{

    public static class Triplet 
    {
        int node1;
        int node2;
        int weight;
        Triplet(int node1,int node2,int weight)
        {
            this.node1=node1;
            this.node2=node2;
            this.weight=weight;
        }
    }
    public static void helper(List<Triplet> adj,int[] ans)
    {
        for(int i=0;i<adj.size();i++)
        {
            Triplet t=adj.get(i);
            int node1=t.node1;
            int node2=t.node2;
            int weight=t.weight;
            
            if(ans[node1]!=Integer.MAX_VALUE)
            {
                int new_weight=weight+ans[node1];

                if(new_weight<ans[node2])
                {
                    ans[node2]=new_weight;
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

        int[] ans= new int[n];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=Integer.MAX_VALUE;
        }
        ans[0]=0;

        for(int i=0;i<adj.size()-1;i++)
        {
            helper(adj, ans);
        }

        for(int i=0;i<adj.size();i++)
        {
            Triplet t=adj.get(i);
            int node1=t.node1;
            int node2=t.node2;
            int weight=t.weight;
            
            if(ans[node1]!=Integer.MAX_VALUE)
            {
                int new_weight=weight+ans[node1];

                if(new_weight<ans[node2])
                {
                    ans[node2]=new_weight;
                }
            }
        }
        
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}

