// 1052. Grumpy Bookstore Owner

/*There is a bookstore owner that has a store open for n minutes. You are given an integer array customers of length n where customers[i] is the number of the customers that enter the store at the start of the ith minute and all those customers leave after the end of that minute.
During certain minutes, the bookstore owner is grumpy. You are given a binary array grumpy where grumpy[i] is 1 if the bookstore owner is grumpy during the ith minute, and is 0 otherwise.
When the bookstore owner is grumpy, the customers entering during that minute are not satisfied. Otherwise, they are satisfied.
The bookstore owner knows a secret technique to remain not grumpy for minutes consecutive minutes, but this technique can only be used once.
Return the maximum number of customers that can be satisfied throughout the day. */

/*Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
Output: 16 */


package sliding_window;
import java.util.*;
public class grumpy_bookstore 
{
    public static int maxSatisfied(int[] c, int[] g, int m) 
    {
        int i=0,j=m-1;
        int maxunsatisfied=0,unsatisfied=0;
        int count=0;
        for(int k=i;k<=j;k++)
        {
            if(g[k]==1)
            unsatisfied=unsatisfied+c[k];
        }
        int a=i,b=j;
        while(j<c.length)
        {
            
            if(unsatisfied>maxunsatisfied)
            {
                maxunsatisfied=unsatisfied;
                a=i;
                b=j;
            }
            i++;
            j++;
            if(j<c.length && g[j]==1) unsatisfied=unsatisfied+c[j];
            if(g[i-1]==1) unsatisfied=unsatisfied-c[i-1];
        }
        for(int k=a;k<=b;k++)
        {
            if(g[k]==1)
            {
                g[k]=0;
            }
        }
        for(int l=0;l<c.length;l++)
        {
            if(g[l]==0)
            {
                count=count+c[l];
            }
        }
        return count;

    }
    public static void main(String[] args) 
    {
        int[] cus={1,0,1,2,1,1,7,5};
        int[] grumpy={0,1,0,1,0,1,0,1};
        int k=3;
        System.out.println(maxSatisfied(cus,grumpy,k));

    }
}
