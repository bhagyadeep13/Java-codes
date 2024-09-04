
//  1497. Check If Array Pairs Are Divisible by k

// Given an array of integers arr of even length n and an integer k.
// We want to divide the array into exactly n / 2 pairs 
// such that the sum of each pair is divisible by k.
// Return true If you can find a way to do that or false otherwise.

package HashSet_HashMaps;
import java.util.*;
public class  leet1497_ArrayPairs
{
    public static boolean canArrange(int[] arr, int k) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int ele=arr[i]%k;
            if(ele<0) ele=ele+k;
            if(h.containsKey(arr[i]))
            {
                int freq=h.get(arr[i]);
                h.put(ele, freq+1);
            }
            else
            h.put(ele, 1);
        }
        if(h.containsKey(0))
        {
            if(h.get(0)%2!=0) return false;
            h.remove(0);
        }
        for(int key : h.keySet())
        {
            int rem=k-key;
            if(!h.containsKey(rem)) return false;
            if(h.get(rem)!=h.get(key)) return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,6};
        boolean ans=canArrange(a, 5);
        System.out.println(ans);
    }
}
