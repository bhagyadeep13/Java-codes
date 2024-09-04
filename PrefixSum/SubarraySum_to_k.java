package PrefixSum;
import java.util.*;
public class SubarraySum_to_k 
{
    public static int helper(int[] a,int k)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i=0;i<a.length;i++)     // if(a[i]==k) count++;
        {                              // if(h.containsKey(a[i]-k)) count=count+h.get(a[i]-k);
            if(a[i]==k) count++;
            if(h.containsKey(a[i]-k))
            {
                count=count+h.get(a[i]-k);
            }
            if(h.containsKey(a[i]))        // For counting the frequency of all elements
            {
                int freq=h.get(a[i]);
                h.put(a[i],freq+1);
            }
            else
            h.put(a[i],1);
        }
        return count;
    }
    
    public static void main(String[] args) 
    {
        int[] a={1,2,3};
        for(int i=1;i<a.length;i++)       // Prefix sum of the array
        {
            a[i]=a[i-1]+a[i];
        }
        System.out.println(helper(a, 3));
    }
}

