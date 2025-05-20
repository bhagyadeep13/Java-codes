package Graph;
import java.util.*;
public class a 
{
    public static void main(String[] args) 
    {
        List<List<Integer>> adj=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        List<Integer> e=new ArrayList<>();
        a.add(1);
        b.add(2); b.add(3);
        c.add(3); c.add(4);
        e.add(3);
        adj.add(a); adj.add(b); adj.add(c); adj.add(d); adj.add(e);
        int n=adj.size();
        int[] inDegree = new int[n];
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                int val = adj.get(i).get(j);
                inDegree[val]++;
            }
        }

        // kahn's algorithm
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<inDegree.length;i++)
        {
            if(inDegree[i]==0)
            {
                q.add(i);
            }
        }

        while(q.size()>0)
        {
            int front = q.remove();
            for(int i=0;i<adj.get(front).size();i++)
            {
                int val = adj.get(front).get(i);
                inDegree[val]--;
                if(inDegree[val]==0)
                {
                    q.add(val);
                }
            }
            al.add(front);
        }
        System.out.println(al);
        if(al.size()==n) // Cycle not detected
        {
            System.out.println(false);
        }
        else
        {
            System.out.println(true);
        }
    }
}

