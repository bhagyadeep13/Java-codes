// 3446. Sort Matrix by Diagonals

/*You are given an n x n square matrix of integers grid. Return the matrix such that:
The diagonals in the bottom-left triangle (including the middle diagonal) are sorted in non-increasing order.
The diagonals in the top-right triangle are sorted in non-decreasing order */

package multiArray;
import java.util.*;;
public class diagonal_sort 
{
    public static void main(String[] args) 
    {
        int[][] g={{1,7,3},{9,8,2},{4,5,6}};
        int n=g.length;
        int lists=(g.length*2)-1;  // number of diagonal for a (n*n) matrix
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        for(int i=0;i<lists;i++)
        {
            List<Integer> al=new ArrayList<>();
            h.put(n-1-i,al);
        }
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                int diff = i-j;
                h.get(diff).add(g[i][j]);
            }
        }
        for(int ele : h.keySet())
        {
            if(ele>=0 && h.get(ele).size()>1)
            Collections.sort(h.get(ele),Collections.reverseOrder()); // reverse sort
            else
            if(ele<0 && h.get(ele).size()>1)
            {
                Collections.sort(h.get(ele)); // sort
            }
        }
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                int diff = i-j;
                g[i][j] = h.get(diff).remove(0);
            }
        }
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                System.out.print(g[i][j]+" ");
            }
            System.out.println();
        }
    }
}
