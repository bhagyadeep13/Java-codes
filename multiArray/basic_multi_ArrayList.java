package multiArray;
import java.util.*;
public class basic_multi_ArrayList 
{
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        List<List<Integer>> l= new ArrayList<>();
        a.add(10);  a.add(20); a.add(30);
        b.add(40); b.add(50);
        d.add(60);
        l.add(a); l.add(b); l.add(c); l.add(d);
        System.out.println(l);
        for(int i=0;i<l.size();i++)                  // Direct printing
        {
            System.out.println(l.get(i));
        }
        for(int i=0;i<l.size();i++)                    // Proper Printing
        {
            List<Integer> l1=l.get(i);
            for(int j=0;j<l1.size();j++)
            {
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
         System.out.println();
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }
      }        
}
