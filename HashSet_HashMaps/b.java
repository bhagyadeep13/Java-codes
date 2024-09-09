package HashSet_HashMaps;
import java.util.*;
public class b 
{
    public static int helper(int[] a,int a1,int b,int x)
    {
        TreeMap<Integer,Integer> h=new TreeMap<>();
        for(int i=a1;i<=b;i++)
        {
            if(a[i]<1)
            {
                if(h.containsKey(a[i]))
                {
                    int freq=h.get(a[i]);
                    h.put(a[i],freq+1);
                }
                else
                h.put(a[i],1);
            }
        }
        int count=1;
        if(h.size()==0) return 0;
        for(int ele : h.keySet()) 
        {
            if(count==x)
            return ele;
            count++;
        }
        System.out.println(h);
        return 1;
    }
    public static void getSubarrayBeauty(int[] nums, int k, int x) 
    {
        int[] ans=new int[nums.length-k+1];
        int i=0,j=k-1;
        int m=0;
        while(j<nums.length)
        {
            ans[m]=helper(nums,i,j,x);
            m++;
            i++;
            j++;
        }
        for(int l=0;l<ans.length;l++)
        {
            System.out.print(ans[l]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={-46,-34,-46};
        int k=3;
        int m=3;
        getSubarrayBeauty(a, k, m);
    }
}

