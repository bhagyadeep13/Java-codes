package multiArray;
import java.util.*;
public class p 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> all=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> al=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    al.add(1);
                }
                else
                {
                    al.add(all.get(i-1).get(j) + all.get(i-1).get(j-1));
                }
            }
            all.add(al);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(all.get(i));
        }
    }
   
}
