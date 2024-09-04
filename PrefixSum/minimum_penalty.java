// 2483. Minimum Penalty for a Shop

/*You are given the customer visit log of a shop represented by a 0-indexed string customers consisting only of characters 'N' and 'Y':
if the ith character is 'Y', it means that customers come at the ith hour
whereas 'N' indicates that no customers come at the ith hour.
If the shop closes at the jth hour (0 <= j <= n), the penalty is calculated as follows:
For every hour when the shop is open and no customers come, the penalty increases by 1.
For every hour when the shop is closed and customers come, the penalty increases by 1.
Return the earliest hour at which the shop must be closed to incur a minimum penalty.
Note that if a shop closes at the jth hour, it means the shop is closed at the hour j.*/

// Input: customers = "YYNY"
// Output: 2

package PrefixSum;
import java.util.*;
public class minimum_penalty 
{
    public static void main(String[] args) {
        String c="YYNY";
        int min=Integer.MAX_VALUE;

        int[] presum=new int[c.length()+1];
        int[] suffsum=new int[c.length()+1];
        presum[0]=0;
        suffsum[suffsum.length-1]=0;
        for(int i=1;i<presum.length;i++)   // presum array banenge agar vo i pe Y h toh
        {                                  // ese hi rehne do
            if(c.charAt(i-1)=='Y')          // or else me us me pehli value + 1 daal do
            presum[i]=presum[i-1];
            else
            presum[i]=presum[i-1]+1;
        }

        c=c+"b";
        
        for(int i=suffsum.length-2;i>=0;i--)
        {
            if(c.charAt(i)=='Y')
            suffsum[i]=suffsum[i+1]+1;
            else
            suffsum[i]=suffsum[i+1];
        }
       
        int[] ans=new int[suffsum.length];
        for(int i=0;i<presum.length;i++)
        {
            presum[i]=presum[i]+suffsum[i];
            min=Math.min(min,presum[i]);
        }
        for(int i=0;i<presum.length;i++)
        {
            if(min==presum[i]) 
            {
            System.out.println(i);
            return;
            }
        }
    }
    }

