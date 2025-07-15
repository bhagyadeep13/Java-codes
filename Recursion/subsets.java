package Recursion;
import java.util.*;
public class subsets 
{
    static List<List<Integer>> all;
    static List<Integer> all1;
    static boolean ans;
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
    // subsets means subsequences 
    public static void subsets2(int i,int[] a,List<Integer> al,int sum1)  // T.C == O(POW(2,N))
    {
        if(i==a.length) 
        {
            int sum=0;
            for(int j=0;j<al.size();j++)
            {
                sum=sum+al.get(j);
            }
            if(sum==sum1) 
            {
                ans=true;
            }
            else
            all1.add(sum);
            return;
        }
        subsets2(i+1,a,al,sum1);
        al.add(a[i]);
        subsets2(i+1,a,al,sum1);
        al.remove(al.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        all1=new ArrayList<>();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        /*List<List<Integer>> all=new ArrayList<>();
        subset(0,a,all);
        System.out.println(all);*/
        List<Integer> al= new ArrayList<>();
        subsets2(0, a, al,1);
        System.out.println(ans);
        System.out.println(all1);
    }
}
