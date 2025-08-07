package multiArray;

import java.util.*;

public class d 
{
    static class Pair implements Comparable<Pair>
    {
        int val;
        int idx;
        Pair(int val,int idx)
        {
            this.val = val;
            this.idx = idx;
        }
        public int compareTo(Pair p)
        {
            if(p.val==this.val)
            {
                return this.idx - p.idx;
            }
            return this.val - p.val;
        }
    }
    public static int helper(List<Pair> a,int t)
    {
        int st =0;
        int end = a.size()-1;
        int ans = -1;
        while(st<=end)
        {
            int mid = st + (end-st)/2;
            if(a.get(mid).val>=t)
            {
                ans = mid;
                end = mid -1;
            }
            else
            {
                st = mid +1;
            }
        }
        if(ans==-1) return -1;
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] a= {6,4,7};
        List<Pair> al = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            al.add(new Pair(a[i], i));
        }
        Collections.sort(al);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(al.get(i).val+" "+al.get(i).idx);
        }
        System.out.println(helper(al,3));
        for(int i=0;i<a.length;i++)
        {
            System.out.println(al.get(i).val+" "+al.get(i).idx);
        }
    }
}
