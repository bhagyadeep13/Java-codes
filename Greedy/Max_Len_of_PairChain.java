package Greedy;
import java.util.*;
public class Max_Len_of_PairChain
{
    public static void main(String[] args) 
    {
        int[][] a={{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(a,(a1,a2) -> a1[1]-a2[1]);  // sort on the basis of 1 index
        int pre=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(pre<a[i][0])
            {
                count++;
                pre=a[i][1];
            }
        } 
        System.out.println(count);
    }
}
