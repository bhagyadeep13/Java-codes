package multiArray;
import java.util.*;
public class pascal_triangle 
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     List<List<Integer>> l=new ArrayList<>();
     for(int i=0;i<n;i++)
     {
        List<Integer> l1=new ArrayList<>();
        for(int j=0;j<=i;j++)
        {
            if(j==0||j==i)
            l1.add(1);
            else
            l1.add(l.get(i-1).get(j)+l.get(i-1).get(j-1));
        }
        l.add(l1);
     }
     System.out.println(l.get(n-1));
     for(int i=0;i<l.size();i++)
     {
        List<Integer> x=l.get(i);
        for(int j=0;j<x.size();j++)
        {
            System.out.print(l.get(i).get(j)+" ");
        }
        System.out.println();
     }
 }

   }    

