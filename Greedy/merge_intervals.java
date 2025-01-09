package Greedy;
import java.util.*;
public class merge_intervals 
{
    public static void helper(int[][] a,List<List<Integer>> all)
    {
        for(int i=0;i<a.length;i++)
        {
            List<Integer> al=new ArrayList<>();
            if(all.size()==0 || all.get(all.size()-1).get(1)<a[i][0])
            {
                al.add(a[i][0]);
                al.add(a[i][1]);
                all.add(al);
            }
            else
            {
                all.get(all.size()-1).set(0,all.get(all.size()-1).get(0));
                all.get(all.size()-1).set(1,Math.max(a[i][1],all.get(all.size()-1).get(1)));
            }
        }
    }
    public static void main(String[] args) 
    {
        int[][] a={{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(a,(a1,a2) -> a1[0]-a2[0]);
        List<List<Integer>> all=new ArrayList<>();
        helper(a,all);
        System.out.println(all);

    }
}
