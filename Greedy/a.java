package Greedy;
import java.util.*;
public class a 
{
    public static int maximumUnits(int[][] nums,int t)
    {
        int units=0;
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i][0];
            int b=nums[i][1];
            int min=Math.min(t,a);
            t=t-min;
            units=units+min*b;
            if(t==0)
            return units;
        }
        return units;
    }
    public static void main(String[] args) 
    {
        int[][] a = {{1,3},{2,2},{3,1}};
        Arrays.sort(a,(a1,a2) -> a2[1]-a1[1]);
        int trucksize=4;
        System.out.println(maximumUnits(a, trucksize));
    }
}
