package HashSet_HashMaps;
import java.util.*;
public class a 
{
    public static void main(String[] args) 
    {
        int[] nums={10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        long max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            long pro=1;
            for(int j=i;j<nums.length;j++)
            {
                pro=pro*(long)nums[j];
                System.out.println(pro);
                max=Math.max(max,pro);
            }
        }
        System.out.println(max);
    }
}
