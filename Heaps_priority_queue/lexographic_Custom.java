package Heaps_priority_queue;

import java.util.PriorityQueue;

public class lexographic_Custom 
{
    static class Pair implements Comparable<Pair>
{
    String key;
    int val;

    Pair(String key,int val)
    {
        this.key = key;
        this.val = val;
    }

    @Override
    public int compareTo(Pair p)
    {
        if(this.val == p.val)
        {
            return p.key.compareTo(this.key); // lexicographical order
        }
        return this.val - p.val; // ascending order by value
    }
}
    public static void main(String[] args) 
    {
        PriorityQueue<Pair> s= new PriorityQueue<>();
        s.add(new Pair("a", 0));
        s.add(new Pair("b", 0));
        s.add(new Pair("c", 0));
        s.add(new Pair("d", 0));
        while(s.size()>0)
        {
            System.out.println(s.remove().key);
        }
    }
}
