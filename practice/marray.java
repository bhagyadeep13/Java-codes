package practice;
import java.util.*;
public class marray 
{
    static List<List<Integer>> pascal(int n)
    {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> al=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                al.add(1);
                else
                al.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
            }
            l.add(al);
        }
        return l;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> al=pascal(n);
        for(int i=0;i<al.size();i++)
        {
            List<Integer> l1=al.get(i);
            for(int j=0;j<l1.size();j++)
            {
                System.out.print(l1.get(j)+" ");
            }
            System.out.println();
        }
        


    }
}
