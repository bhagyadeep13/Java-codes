package array;
import java.util.*;
public class max_pro_subarray 
{
    public static void main(String[] args) 
    {
        int[] a={2,3,-2,4};
            int maxEnd = a[0];
            int minEnd = a[0];
            int max = a[0];
            for(int j=1;j<a.length;j++)
            { 
                int curr = a[j];
                int tempMax = Math.max(curr,Math.max(maxEnd*curr,minEnd*curr));
                int tempMin = Math.min(curr,Math.min(maxEnd*curr,minEnd*curr));

                maxEnd=tempMax;
                minEnd=tempMin;

                max=Math.max(max, maxEnd);
            }
            System.out.println(max);
    }
}
