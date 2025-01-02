// 77. Combinations

/*Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
You may return the answer in any order. */

/*Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]] */

package Backtracking;
import java.util.*;
public class Combinations 
{
    public static void helper(List<List<Integer>> all,List<Integer> al,int st,int n,int k)
    {
        if(al.size()==k)
        {
            List<Integer> l=new ArrayList<>(al);
            all.add(l);
            return;
        }
        for(int i=st;i<=n;i++)
        {
            al.add(i);
            helper(all, al, i+1, n, k);
            al.remove(al.size()-1);
        }
    }
    public static void main(String[] args) 
    {
        int n=4;
        int k=2;
        List<List<Integer>> all=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        helper(all, al, 1, n, k);
        System.out.println(all);
    }
}
