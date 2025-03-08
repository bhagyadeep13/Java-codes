package Graph;
import java.util.*;
public class keys_and_rooms_DFS 
{
    public static void dfs(List<List<Integer>> r, boolean[] vis,int i)
    {                                           // USING DFS
        vis[i]=true;
        for(int j=0;j<r.get(i).size();j++)
            {
                    int val = r.get(i).get(j);
                    if(!vis[val])
                    {
                        dfs(r,vis,val);
                    }
            }
    }
    public static void main(String[] args) 
    {
        List<List<Integer>> r=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        a.add(1);
        b.add(2);
        c.add(3);
        r.add(a); r.add(b); r.add(c); r.add(d);
        boolean[] vis = new boolean[r.size()];
        vis[0]=true;
        for(int i=0;i<r.size();i++)
        {
            if(vis[i])
            {
                dfs(r,vis,i);
            }
        }
        for(int i=0;i<vis.length;i++)
        {
            if(vis[i]==false) 
            {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
