package Recursion;
import java.util.*;
public class subsets 
{
    static List<List<Integer>> all;
    static void subset(int i,int[] a,ArrayList<Integer> al)
    {
        if(i==a.length)
        {
            ArrayList<Integer> al1=new ArrayList<>();
            for(int j=0;j<al.size();j++)
            {
                al1.add(al.get(j));
            }
            all.add(al1);
            return;
        }
        subset(i+1,a,al);
        al.add(a[i]);
        subset(i+1, a, al);
        al.remove(al.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        all=new ArrayList<>();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<>();
        subset(0,a,al);
        System.out.println(all);
    }
}
