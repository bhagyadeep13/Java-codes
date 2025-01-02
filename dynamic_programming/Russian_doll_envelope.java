// 354. Russian Doll Envelopes

/*You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.
One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height.
Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).
Note: You cannot rotate an envelope. */

/*Input: envelopes = [[5,4],[6,4],[6,7],[2,3]]
Output: 3 */

package dynamic_programming;
import java.util.*;
public class Russian_doll_envelope 
{
    public static class Pair implements Comparable<Pair>
    {
        int w;
        int h;
        Pair(int w, int h)
        {
            this.w=w;
            this.h=h;
        }
        public int compareTo(Pair p)
        {
            if(this.w==p.w)
            {
                return p.h-this.h;
            }
                return this.w-p.w;
        }
    }
    public static void main(String[] args) 
    {
        int[][] a={{3,5},{7,13},{6,10},{8,4},{6,7},{7,11}};
        Pair[] p=new Pair[a.length];
        for(int i=0;i<a.length;i++)
        {
            Pair newPair = new Pair(a[i][0], a[i][1]);
            p[i] = newPair;
        }
        Arrays.sort(p);
        int[] dp=new int[a.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<p.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(p[i].w<p[i].h)
                {
                    dp[i] = Math.max(dp[i],dp[j]);
                }
            }
            dp[i]=dp[i]+1;
            max=Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
