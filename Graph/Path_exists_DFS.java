package Graph;
import java.util.*;;
public class Path_exists_DFS 
{
    public static void dfs(List<List<Integer>> all, boolean[] vis, int i,int end)
    {                                       // T.C -- O(V+2E)
        vis[i]=true;                        // USING - DFS
        for(int j=0;j<all.get(i).size();j++)
            {
                int val = all.get(i).get(j);
                if(!vis[val])
                {
                   dfs(all, vis, val, end);
                }
                if(val==end) return;
            }
    }
    public static void main(String[] args) 
    {
        int n=3;
        int[][] e={{0,1},{1,2},{2,0}};
        int s=0;
        int d=2;
        if(s==d) 
        {
            System.out.println(true);
            return;
        }
        List<List<Integer>> all=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> al=new ArrayList<>();
            all.add(al);
        }
        for(int j=0;j<e.length;j++)
        {
            int a=e[j][0];
            int b=e[j][1];
            all.get(a).add(b);
            all.get(b).add(a);
        }
        boolean[] vis=new boolean[n];
        dfs(all,vis,s,d);
        if(vis[d]==false) 
        {
            System.out.println(false);
            return;
        }
        else
        {
            System.out.println(true);
        }
    }
}
