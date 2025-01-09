package Greedy;
import java.util.*;
public class b 
{
    public static int helper2(List<Integer> al)
    {
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++)
        {
            min=Math.min(min,al.get(i));
        }
        for(int i=0;i<al.size();i++)
        {
            al.set(i,al.get(i)-min);
            if(al.get(i)==0) 
            {
                al.remove(i);
                i--;
                count++;
            }
        }
        return count;
    }
    public static void helper(List<Integer> al,List<Integer> ans)
    {
            int sum=0;
            while(al.size()!=0)
            {
                int val = helper2(al);
                ans.add(val);
                sum=sum+val;
            }
            ans.add(sum);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        List<Integer> ans=new ArrayList<>();
        helper(al,ans);
        System.out.println(ans);
    }
}
