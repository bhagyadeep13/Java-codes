//Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

package HashSet_HashMaps;
import java.util.*;
public class Array_duplicates 
{
    public static TreeSet<Integer> duplicates(int[] arr)  // TC--O(n) Using Hashmap
    {
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(arr[i]))
            {
                int freq=h.get(arr[i]);
                h.put(arr[i],freq+1);
            }
            else
            h.put(arr[i],1);
        }
        TreeSet<Integer> t=new TreeSet<>();
        for(int key : h.keySet())
        {
            if(h.get(key)>1)
            t.add(key);
        }
        for(int ele : t)
        {
            al.add(ele);
        }
        return t;
    }
    public static void main(String[] args) {

        int[] a={2,3,1,2,3};

        System.out.println(duplicates(a));  // return the ans in sorted forms
        

    }
}
