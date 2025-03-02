package Heaps_priority_queue;
import java.util.*;
public class c 
{
    static class Node implements Comparable<Node>
    {
        int x;
        int y;
        Node(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        public int compareTo(Node n)
        {
            return n.x-this.x;
        }
    }
    public static void print(Node[] n)
    {
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i].x+" "+n[i].y);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node[] n=new Node[4];
        n[0]=new Node(1, 2);
        n[1]=new Node(3, 4);
        n[2]=new Node(5, 6);
        n[3]=new Node(7, 8);
        print(n);
        Arrays.sort(n);
        print(n);
    }
}
