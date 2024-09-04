
// 1207. Unique Number of Occurrences

//Given an array of integers arr, return true if the number 
// of occurrences of each value in the array is unique or false otherwise.

package HashSet_HashMaps;
import java.util.*;
public class leetcode_1207 
{
    public static boolean uniqueOccurrences(int[] arr)   // Logic - 
    {                                                   // 1-Pehle ek hashmap banao
        HashSet<Integer> hs=new HashSet<>();           // then store all the frequency all elements
        HashMap<Integer,Integer> h=new HashMap<>();   // Then ek hashset banao then hashmap me travel
        for(int i=0;i<arr.length;i++)                // karke sare elements hashset me daal do
        {                                           // Then if(hashset(size)!=hashmap(size)) return false
            if(h.containsKey(arr[i]))              //  else return true;
            {
                int freq=h.get(arr[i]);
                h.put(arr[i],freq+1);
            }
            else
            h.put(arr[i],1);
        }
        for(int val : h.values())
        {
            hs.add(val);
        }
        if(hs.size()!=h.size())
        return false;
        else
        return true;
    }
    public static void main(String[] args) 
    {
        int[] a={1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(a));
    }
}
