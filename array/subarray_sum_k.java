package array;

import java.util.HashMap;

public class subarray_sum_k 
{
    public static void main(String[] args) 
    {
        int[] a={1,1,1};
        int k=2;
        for(int i=1;i<a.length;i++)
        {
            a[i] = a[i-1]+a[i];
        }
        int count=0;    
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k) count++;
            if(h.containsKey(a[i]-k))
            {
                count = count + h.get(a[i]-k);
            }
            if(h.containsKey(a[i]))
            {
                h.put(a[i], h.get(a[i])+1);
            }
            else
                h.put(a[i], 1);

        }
        System.out.println(count);
    }
}
