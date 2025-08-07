// 841. Keys and Rooms

/*There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise. */

/*Example 1:

Input: rooms = [[1],[2],[3],[]]
Output: true */

package Graph;
import java.util.*;
public class keys_and_rooms 
{
    public static void bfs(List<List<Integer>> r, boolean[] vis,int i)
    {
        vis[i]=true;
        Queue<Integer> q=new ArrayDeque<>();
        q.add(i);
        while(q.size()>0)
        {
            int front = q.remove();
            for(int j=0;j<r.get(front).size();j++)
            {
                    int val = r.get(front).get(j);
                    if(!vis[val])
                    {
                        q.add(val);
                        vis[val]=true;
                    }
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
        bfs(r,vis,0);
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
