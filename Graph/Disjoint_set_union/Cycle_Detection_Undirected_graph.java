package Graph.Disjoint_set_union;
import java.util.*;
public class Cycle_Detection_Undirected_graph 
{
    static int[] parent;
    static boolean flag;

    public static int find(int a) {
        if (parent[a] == a) return a;
        return parent[a] = find(parent[a]); // Path compression
    }

    public static void union(int a, int b) {
        int leaderA = find(a);
        int leaderB = find(b);
        if (leaderA != leaderB) {
            parent[leaderB] = leaderA;
        } else {
            flag = true;
        }
    }
    public static void main(String[] args) 
    {
        flag = false;
        List<List<Integer>> adj=new ArrayList<>();
        int n = adj.size();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        List<Integer> e=new ArrayList<>();
        
        a.add(1);
        b.add(0); b.add(2); b.add(4);
        c.add(1); c.add(3);
        d.add(2); d.add(4);
        e.add(1); e.add(3);

        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) { // Fixed condition
                int val = adj.get(i).get(j);
                if (val > i) { // To avoid processing the same edge twice
                    union(i, val);
                }
            }
        }
        System.out.println(flag);
    }
}
