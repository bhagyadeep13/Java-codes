package Leetcode_IMP.HashMaps;
import java.util.*;
public class Intersection_Arrays 
{
    public static void intersect(int[] nums1, int[] nums2) 
    {
       List<Integer> al=new ArrayList<>();
       HashMap<Integer,Integer> h=new HashMap<>();
       for(int i=0;i<nums1.length;i++)
       {
            if(h.containsKey(nums1[i]))
            {
                int freq=h.get(nums1[i]);
                h.put(nums1[i],freq+1);
            }
            else
            h.put(nums1[i],1);
       }
       System.out.println(h);
       for(int i=0;i<nums2.length;i++)
       {
            if(h.containsKey(nums2[i]))
            {
                int freq=h.get(nums2[i]);
                h.put(nums2[i],freq-1);
                if(freq==1) h.remove(nums2[i]);
                System.out.println(h);
                al.add(nums2[i]);
            }
       }
       System.out.println(al);
       int[] ans=new int[al.size()];
       for(int i=0;i<al.size();i++)
       {
        ans[i]=al.get(i);
       }

    }
    public static void main(String[] args) 
    {
        int[] a={1,2,2,1};
        int[] b={2,2};
        intersect(a, b);

    }
}
